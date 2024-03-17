package strategy;

public class SlowFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("flying slow");
    }
}
