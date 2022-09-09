package patterns.strategypattern;

import patterns.strategypattern.behaviors.display.DisplayAsGraphic;
import patterns.strategypattern.behaviors.display.DisplayAsText;
import patterns.strategypattern.behaviors.fly.JetFlying;
import patterns.strategypattern.behaviors.fly.SimpleFlying;
import patterns.strategypattern.behaviors.quack.NoQuack;
import patterns.strategypattern.behaviors.quack.SimpleQuack;

public class DuckApp {

    public static void main(String[] args) {
        Duck normalDuck = new Duck(new SimpleFlying(), new SimpleQuack(), new DisplayAsText());
        Duck donaldDuck = new Duck(new JetFlying(), new NoQuack(), new DisplayAsGraphic());
        // y todas las combinaciones que deseemos

        normalDuck.display();
        normalDuck.quack();
        normalDuck.fly();

        donaldDuck.display();
        donaldDuck.quack();
        donaldDuck.fly();
    }
}
