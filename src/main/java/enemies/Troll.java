package enemies;

import behaviours.IWeapon;

public class Troll extends Enemy {

    private int healthPoints;
    private IWeapon weapon;


    public Troll(IWeapon weapon, int healthPoints) {
        super(weapon, healthPoints);
    }

}
