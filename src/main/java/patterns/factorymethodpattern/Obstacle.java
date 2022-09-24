package patterns.factorymethodpattern;

public interface Obstacle {
    int[] getPosition();
    int[] getSize();
    int getVelocity();
    int getDirection();
}
