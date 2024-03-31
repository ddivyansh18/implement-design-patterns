package iterator.dinermerger;

public class DinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position = 0;
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    public boolean hasNext() {
        return items.length > position;
    }

    public MenuItem next() {
        return items[position++];
    }
}
