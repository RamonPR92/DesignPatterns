package patterns.strategy.behaviors.display;

public class DisplayAsGraphic implements IDisplayBehavior{
    @Override
    public void display() {
        System.out.println("Display as a graphic!!!");
    }
}
