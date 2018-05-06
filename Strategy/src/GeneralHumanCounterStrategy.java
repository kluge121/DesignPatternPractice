import java.util.Random;

public class GeneralHumanCounterStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private int prevHand;
    private int currentHand;
    private int flag = 0;


    public GeneralHumanCounterStrategy(int seed) {
        random = new Random(seed);

    }

    @Override
    public Hand nextHand() {

        prevHand = currentHand;
        random.setSeed(System.nanoTime());
        flag = random.nextInt(5);

        if (flag == 0) {
            switch (prevHand) {
                case 0:
                    currentHand = 1;
                    break;
                case 1:
                    currentHand = 2;
                    break;
                case 2:
                    currentHand = 0;
                    break;
                default:
            }
        } else {
            currentHand = random.nextInt(3);
        }

        return Hand.getHand(currentHand);
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}





















