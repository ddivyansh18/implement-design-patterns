package strategy;

public class MeekQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("meek quack");
    }
}
