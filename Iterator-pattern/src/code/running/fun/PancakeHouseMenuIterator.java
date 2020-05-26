package code.running.fun;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    List<MenuItem> menuItems;

    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Boolean hasNext() {

        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        // 略
    }
}
