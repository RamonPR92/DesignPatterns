package patterns.strategypattern.behaviors.quack;

public class NoQuack implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("No quack!!!");
    }
}
