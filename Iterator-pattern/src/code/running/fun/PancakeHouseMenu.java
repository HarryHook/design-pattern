package code.running.fun;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {

    Iterator<MenuItem> createIterator() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("bacon", "yyy", false, 21.4));
        return new PancakeHouseMenuIterator(menuItems);
    }
}
