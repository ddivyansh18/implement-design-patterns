package strategy;

public class FakeFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("fake fly behaviour");
    }
}
