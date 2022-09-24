package patterns.strategy.behaviors.display;

public class DisplayAsText implements IDisplayBehavior{
    @Override
    public void display() {
        System.out.println("Display as a text!!!");
    }
}
