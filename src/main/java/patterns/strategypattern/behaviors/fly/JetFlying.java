package patterns.strategypattern.behaviors.fly;

public class JetFlying implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("Jet Flying!!!");
    }
}
