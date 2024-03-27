package decorator;

public class Decaf extends Beverage{
    public double cost() {
        return 1.5;
    }

    public Decaf() {
        description = "decaf coffee";
    }
}
