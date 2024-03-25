package factory;

public class ChicagoPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "clam" -> new ChicagoStyleClamPizza();
            default -> null;
        };
    }
}
