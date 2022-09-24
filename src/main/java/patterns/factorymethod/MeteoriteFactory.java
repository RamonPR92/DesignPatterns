package patterns.factorymethod;

public class MeteoriteFactory implements ObstacleFactory{

    @Override
    public Obstacle createObstacle(int level) {
        return new Meteorite(level);
    }
}
