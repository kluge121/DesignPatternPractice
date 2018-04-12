
import java.util.Iterator;


// Array Iterator
public class FirstMenu implements Menu {

    private static final int ARRAY_MAX_SIZE = 3;
    private MenuItem[] menuItems;
    private int itemIndex = 0;

    public FirstMenu() {

        menuItems = new MenuItem[ARRAY_MAX_SIZE];

        addItem("월수금일 에피타이저", "(빵, 수프)", true, 10000);
        addItem("월수금일 메인디쉬", "(소고기 스테이크)", false, 50000);
        addItem("월수금일 디저트", "(초코파이)", true, 12000);


    }


    private void addItem(String name, String description, boolean vegetarian, int price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (itemIndex > ARRAY_MAX_SIZE) {
            System.err.println("메뉴가 꽉 찼습니다.");
        } else {
            menuItems[itemIndex] = menuItem;
            itemIndex += 1;
        }

    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {

        return new FirstMenuIterator(menuItems);
    }
}
