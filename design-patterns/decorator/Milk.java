package decorator;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
