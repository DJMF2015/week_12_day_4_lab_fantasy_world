package weapons;

import behaviours.IWeapon;

public class Axe implements IWeapon {

    private int damage;
    private String axeType;
    private int weight;

    public Axe(int damage, String axeType, int weight) {
        this.damage = damage;
        this.axeType = axeType;
        this.weight = weight;
    }

    public String getAxeType() {
        return axeType;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int damageValue() {
        return damage;
    }
}
