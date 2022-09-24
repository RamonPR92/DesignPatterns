package patterns.decorator;

public class UnderBarrel extends WeaponAccesory{
    public UnderBarrel(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int aimAndFire() {
        return weapon.aimAndFire() + 10;
    }
}
