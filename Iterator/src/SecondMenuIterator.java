import java.util.ArrayList;
import java.util.Iterator;


//ArrayList Iterator
public class SecondMenuIterator implements Iterator {

    private ArrayList<MenuItem> items;
    private int position = 0;

    public SecondMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {

        return position < items.size() && items.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
