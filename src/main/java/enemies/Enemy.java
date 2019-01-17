package enemies;

import behaviours.IWeapon;
import players.Player;

public abstract class Enemy {
    private int healthPoints;
    private IWeapon weapon;


    public Enemy(IWeapon weapon, int healthPoints){
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

    public void setHealthPoints(int points){
        this.healthPoints = points;
    }

    public void takeDamage(int damage){
        System.out.println(this.healthPoints -= damage);
    }


    public IWeapon getWeapon(){
         return this.weapon;
    }


    public void attack(Player player){
         int damage = weapon.damageValue();
       player.setHealthPoints(player.getHealthPoints() - damage);

    }
}
