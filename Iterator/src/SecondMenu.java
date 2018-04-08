import java.util.ArrayList;
import java.util.Iterator;

public class SecondMenu implements Menu {

    private ArrayList<MenuItem> menuItems;

    public SecondMenu() {

        menuItems = new ArrayList<MenuItem>();

        addItem("화목토 에피타이저", "(죽)", false, 10000);
        addItem("화목토 메인디쉬", "(한우 떡갈비)", false, 60000);
        addItem("화목토 디저트", "(수정과, 호떡)", true, 12000);
    }


    private void addItem(String name, String description, boolean vegetarian, int price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);

    }


    @Override
    public Iterator<MenuItem> createIterator() {
        return new SecondMenuIterator(menuItems);
    }
}
