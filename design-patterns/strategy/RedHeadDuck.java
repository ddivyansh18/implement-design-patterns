package strategy;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        flyBehaviour = new SlowFly();
        quackBehaviour = new MeekQuack();
    }
    public void display() {
        System.out.println("redhead duck");
    }
}
