package players;

import behaviours.IWeapon;

public abstract class Fighter extends Player{

    private IWeapon weapon;
    private String name;
    private int healthPoints;

    public Fighter(IWeapon weapon, String name, int healthPoints){
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        
    }
}
