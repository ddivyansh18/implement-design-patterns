package factory;

public class NYCPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new NYCStyleCheesePizza();
            case "pepperoni" -> new NYCStylePeeperoniPizza();
            case "clam" -> new NYCStyleClamPizza();
            default -> null;
        };
    }
}
