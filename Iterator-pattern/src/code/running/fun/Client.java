package code.running.fun;

public class Client {

    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Iterator<MenuItem> itemIterator = dinnerMenu.createIterator();
        while (itemIterator.hasNext()) {
            MenuItem menuItem = itemIterator.next();
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
        itemIterator = pancakeHouseMenu.createIterator();

        System.out.println("===========================");
        while (itemIterator.hasNext()) {
            MenuItem menuItem = itemIterator.next();
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }
}
