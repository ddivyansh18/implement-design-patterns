package strategy;
public class FakeQuack implements QuackBehaviour {
    @Override
    public void quack() {
            System.out.println("no quack behaviour");
    }
}