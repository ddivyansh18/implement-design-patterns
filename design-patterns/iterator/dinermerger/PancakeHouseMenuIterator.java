package iterator.dinermerger;


import java.util.*;

public class PancakeHouseMenuIterator implements Iterator{
    List<MenuItem> menuItems;
    int position = 0;
    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        return position < menuItems.size();
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
