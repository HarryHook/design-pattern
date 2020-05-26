package code.running.fun;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu {

    @Override
    public Iterator<MenuItem> createIterator() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("bacon", "yyy", false, 11.555));
        return new PancakeHouseMenuIterator(menuItems);
    }
}
