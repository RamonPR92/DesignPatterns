package patterns.strategypattern.behaviors.quack;

public class SimpleQuack implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("Simple quack!!!");
    }
}
