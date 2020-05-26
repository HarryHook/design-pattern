package code.running.fun;

public class Client {

    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Iterator<MenuItem> itemIterator = dinnerMenu.createIterator();
        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next().getDescription());
        }
        itemIterator = pancakeHouseMenu.createIterator();

        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next().getDescription());
        }
    }
}
