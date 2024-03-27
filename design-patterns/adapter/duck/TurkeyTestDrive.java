package adapter.duck;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
