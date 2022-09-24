package patterns.factorymethodpattern;

public class Meteorite implements Obstacle {

    private int level;
    private int[] position;
    private int[] size;
    private int direction;
    private int velocity;

    public Meteorite(int level) {
        this.level = level;
        position = new int[2];
        size = new int[2];

        setPosition();
        setSize();
        setVelocity();
        setDirection();
    }

    @Override
    public int[] getPosition() {
        return position;
    }

    @Override
    public int[] getSize() {
        return size;
    }

    @Override
    public int getVelocity() {
        return velocity;
    }

    @Override
    public int getDirection() {
        return direction;
    }

    private void setSize() {
        //calculate size respect to level
    }

    private void setVelocity() {
        //calculate velocity respect to level
    }

    private void setDirection() {
        //calculate direction respect to level
    }

    private void setPosition() {
        //calculate position respect to level
    }
}
