package patterns.facade;

public class Client {
    public static void main(String[] args) {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        System.out.println(" ######################");
        System.out.println(" #### Start System ####");
        System.out.println(" ######################");
        carEngineFacade.startEngine();

        System.out.println(" ######################");
        System.out.println(" #### End System ####");
        System.out.println(" ######################");
        carEngineFacade.stopEngine();
    }
}
