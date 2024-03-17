package strategy;

public class LoudQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("loud quack");
    }
}
