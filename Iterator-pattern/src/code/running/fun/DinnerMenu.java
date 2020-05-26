package code.running.fun;

public class DinnerMenu {

    Iterator<MenuItem> createIterator() {
        MenuItem[] menuItems = {new MenuItem("sanwitch", "xxx", true, 21.4)};
        return new DinnerMenuIterator(menuItems);
    }
}
