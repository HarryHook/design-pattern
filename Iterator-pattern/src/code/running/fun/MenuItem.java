package code.running.fun;

public class MenuItem {

    String name;

    String description;

    Boolean vegetarian;

    double price;

    public MenuItem(String name, String description, Boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
