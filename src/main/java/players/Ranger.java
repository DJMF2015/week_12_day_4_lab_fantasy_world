package players;

import behaviours.IWeapon;

import java.util.ArrayList;

public class Ranger extends Fighter {

    private ArrayList<IWeapon> weapons;
    private IWeapon mainWeapon;
    private String name;
    private int healthPoints;

    public Ranger(IWeapon mainWeapon, String name, int healthPoints) {
        super(mainWeapon, name, healthPoints);
        weapons = new ArrayList<>();
    }

    public void addToWeapons(IWeapon weapon){
        weapons.add(weapon);
    }

    public String getName() {
       return super.getName();
    }

    public IWeapon getWeapon() {
        return super.getWeapon();
    }

    public void setWeapon(IWeapon iWeapon) {
        super.setWeapon(iWeapon);
    }

    public int getHealthPoints() {
        return super.getHealthPoints();
    }

    public void setHealthPoints(int healthPoints) {
        super.setHealthPoints(healthPoints);
    }
}
