package patterns.facade;

public class FuelInjector {
    public void on() {
        System.out.println("Start - fuel injector");
    }

    public void inject() {
        System.out.println("Inject - fuel injector");
    }

    public void off() {
        System.out.println("Off - fuel injector");
    }
}
