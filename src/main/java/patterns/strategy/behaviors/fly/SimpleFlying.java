package patterns.strategy.behaviors.fly;

public class SimpleFlying implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("Simple flying!!!");
    }
}
