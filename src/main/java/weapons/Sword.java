package weapons;

import behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damage;
    private int length;
    private String metal;

    public Sword(int damage, int length, String metal) {
        this.damage = damage;
        this.length = length;
        this.metal = metal;
    }

    @Override
    public int damageValue() {
        return damage;
    }
}
