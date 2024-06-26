package iterator.dinermerger;

public class MenuItem {
    String name;
    String description;
    boolean vegeterian;
    double price;
    public MenuItem(String name, String description, boolean vegeterian, double price) {
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }
    public String toString() {
        return name + ", $" + price + "\n     " + description;
    }
}
