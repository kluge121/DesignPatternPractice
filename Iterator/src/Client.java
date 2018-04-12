

public class Client {

    public static void main(String args[]) {

        FirstMenu firstMenu = new FirstMenu();
        SecondMenu secondMenu = new SecondMenu();

        Waitress waitress = new Waitress(firstMenu, secondMenu);
        waitress.printMenu();

        System.out.println("\n\n 채식 메뉴 \n");
        waitress.printVegetarianMenu();
    }


}
