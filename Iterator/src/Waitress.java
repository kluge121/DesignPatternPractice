import java.util.Iterator;

public class Waitress {


    private Menu menu1;
    private Menu menu2;

    public Waitress(Menu menu1, Menu menu2) {
        this.menu1 = menu1;
        this.menu2 = menu2;
    }

    public void printMenu() {

        Iterator fristtMenuIterator = menu1.createIterator();
        Iterator secondMenuIterator = menu2.createIterator();


        System.out.println(" 월수금일 메뉴\n");
        printMenu(fristtMenuIterator);

        System.out.println("\n\n 화목토 메뉴\n");
        printMenu(secondMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getDescription() + ", " +
                    menuItem.getPrice() + "원"
            );
        }
    }

    public void printVegetarianMenu() {
        printVegetarianMenu(menu1.createIterator());
        printVegetarianMenu(menu2.createIterator());

    }

    private void printVegetarianMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.println(menuItem.getName() + ", " + menuItem.getDescription() + ", " +
                        menuItem.getPrice() + "원"
                );
            }
        }
    }

    public boolean isItemVegetarian(String name) {

        Iterator firstMenuIterator = menu1.createIterator();

        if (isItemVegetarian(name, firstMenuIterator)) {
            return true;
        }
        Iterator secondMenuIterator = menu2.createIterator();

        if (isItemVegetarian(name, secondMenuIterator)) {
            return true;
        }

        return false;

    }

    private boolean isItemVegetarian(String name, Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem.getName().equals(name)) {
                if (menuItem.isVegetarian()) {
                    return true;
                }
            }

        }
        return false;
    }

}
