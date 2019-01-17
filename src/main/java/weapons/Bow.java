package weapons;

import behaviours.IWeapon;

public class Bow implements IWeapon {

    private int damage;
    private String bowType;
    private int distance;

    public Bow(int damage, String bowType, int distance) {
        this.damage = damage;
        this.bowType = bowType;
        this.distance = distance;
    }

    public int getDamage() {
        return damage;
    }

    public String getBowType() {
        return bowType;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int damageValue() {
        return damage;
    }
}
