package patterns.decoratorpattern;

public class Stock extends WeaponAccesory{

    public Stock(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int aimAndFire() {
        return weapon.aimAndFire() + 10;
    }
}
