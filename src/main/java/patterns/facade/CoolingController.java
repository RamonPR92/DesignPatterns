package patterns.facade;

public class CoolingController {
    public void setTemperatureUpperLimit(int defaultCoolingTemp) {
        System.out.println("Set temp: " +  defaultCoolingTemp + " - Cooling controller");
    }

    public void run() {
        System.out.println("Run - Cooling controller");
    }

    public void cool(int maxAllowedTemp) {
        System.out.println("Cool: " +  maxAllowedTemp + " - Cooling controller");
    }

    public void stop() {
        System.out.println("Stop - Cooling controller");
    }
}
