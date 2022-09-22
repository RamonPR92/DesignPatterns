package patterns.decoratorpattern;

public class Ammunition extends WeaponAccesory{
    public Ammunition(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int aimAndFire() {
        return weapon.aimAndFire() + 5;
    }
}
