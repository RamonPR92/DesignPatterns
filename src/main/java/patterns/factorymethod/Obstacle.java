package patterns.factorymethod;

public interface Obstacle {
    int[] getPosition();
    int[] getSize();
    int getVelocity();
    int getDirection();
}
