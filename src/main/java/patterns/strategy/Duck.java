package patterns.strategy;

import patterns.strategy.behaviors.display.IDisplayBehavior;
import patterns.strategy.behaviors.fly.IFlyBehavior;
import patterns.strategy.behaviors.quack.IQuackBehavior;

public class Duck {
    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;
    private IDisplayBehavior displayBehavior;

    public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior, IDisplayBehavior displayBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void display(){
        displayBehavior.display();
    }
}
