package patterns.decorator;

public class BaseWeapon implements Weapon {

    @Override
    public int aimAndFire() {
        return 10;
    }
}
