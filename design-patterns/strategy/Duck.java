package strategy;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck() {
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }
    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }
}