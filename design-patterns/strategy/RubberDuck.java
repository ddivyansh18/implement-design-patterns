package strategy;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new NoFly();
        quackBehaviour = new FakeQuack();
    }

    public void display() {
        System.out.println("rubber duck");
    }
}
