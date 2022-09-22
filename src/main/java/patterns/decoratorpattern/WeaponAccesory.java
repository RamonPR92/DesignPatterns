package patterns.decoratorpattern;

public abstract class WeaponAccesory implements Weapon{

    protected Weapon weapon;

    public WeaponAccesory(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int aimAndFire() {
        return 0;
    }
}
