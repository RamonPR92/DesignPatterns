package patterns.factorymethodpattern;

public class FactoryApp {

    public static void main(String[] args) {
        ObstacleFactory obstacleFactory = new MeteoriteFactory();
        Obstacle meteorito = obstacleFactory.createObstacle(1);
    }
}
