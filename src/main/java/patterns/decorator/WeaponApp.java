package patterns.decorator;

public class WeaponApp {

    public static void main(String[] args) {
        BaseWeapon m4 = new BaseWeapon();
        System.out.println(m4.aimAndFire() + " Base weapon aim and fire ");

        Stock m4WithStock = new Stock(m4);
        System.out.println(m4WithStock.aimAndFire() + " Base weapon + stock aim and fire ");

        UnderBarrel m4StockUnderBarrel = new UnderBarrel(m4WithStock);
        System.out.println(m4StockUnderBarrel.aimAndFire() + " Base weapon + stock + underbarrel aim and fire ");

        Ammunition m4StockUnderBarrelAmmunition = new Ammunition(m4StockUnderBarrel);
        System.out.println(m4StockUnderBarrelAmmunition.aimAndFire() + " Base weapon + stock + underbarrel + ammunition aim and fire ");


    }
}
