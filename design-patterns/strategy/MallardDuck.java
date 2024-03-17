package strategy;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehaviour = new LoudQuack();
        flyBehaviour = new FastFly();
    }

    public void display() {
        System.out.println("mallard duck");
    }
}
