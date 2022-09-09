package patterns.strategypattern;

import patterns.strategypattern.behaviors.display.IDisplayBehavior;
import patterns.strategypattern.behaviors.fly.IFlyBehavior;
import patterns.strategypattern.behaviors.quack.IQuackBehavior;

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
