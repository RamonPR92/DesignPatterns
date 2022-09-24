package patterns.strategy;

import patterns.strategy.behaviors.display.DisplayAsGraphic;
import patterns.strategy.behaviors.display.DisplayAsText;
import patterns.strategy.behaviors.fly.JetFlying;
import patterns.strategy.behaviors.fly.SimpleFlying;
import patterns.strategy.behaviors.quack.NoQuack;
import patterns.strategy.behaviors.quack.SimpleQuack;

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
