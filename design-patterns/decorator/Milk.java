package decorator;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        return this.beverage.cost() + 0.10;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
