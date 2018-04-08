import java.util.Iterator;

public class FirstMenuIterator implements Iterator {

    private MenuItem[] items;
    private int position = 0;

    public FirstMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {

        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
