

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        int player1WinCount = 0;
        double perValue;


        for (int j = 0; j < 1000; j++) {

            Player player1 = new Player("Taro", new GeneralHumanCounterStrategy(seed1));
            Player player2 = new Player("Hana", new WinningStrategy(seed2));
//            Player player2 = new Player("Hana", new ProbStrategy(seed2));

            for (int i = 0; i < 10000; i++) {
                Hand nextHand1 = player1.nextHand();
                Hand nextHand2 = player2.nextHand();
                if (nextHand1.isStrongerThan(nextHand2)) {
//                System.out.println("Winner:" + player1);
                    player1.win();
                    player2.lose();
                } else if (nextHand2.isStrongerThan(nextHand1)) {
//                System.out.println("Winner:" + player2);
                    player1.lose();
                    player2.win();
                } else {
//                System.out.println("Even...");
                    player1.even();
                    player2.even();
                }
            }
            if (player1.getWincount() > player2.getWincount())
                player1WinCount++;

        }

        perValue = (double) player1WinCount / 1000 * 100;
        System.out.println("Total Player1 Win Result:");
        System.out.println(player1WinCount + "번 // " + perValue + "%");


    }
}
