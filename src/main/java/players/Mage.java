package players;

import behaviours.IDefend;
import behaviours.ISpell;
import enemies.Enemy;

public class Mage extends Player {

//    Player player;
    IDefend summonMonster;
    ISpell spell;
    SpellType type;
    private String name;
    private int healthPoints;

    public Mage(IDefend summonMonster, SpellType type, String name, int healthPoints){
        super(name, healthPoints);
        this.summonMonster = summonMonster;
        this.type = type;
    }

    public IDefend getSummonMonster() {
        return summonMonster;
    }

    public int getHealthPoints() {
        return super.getHealthPoints();
    }
    public SpellType getSpell(){
        return type;
    }

    public String getName(){
        return  super.getName();
    }

    public void takeDamage(int damage){
        System.out.println(this.healthPoints -= damage);
    }

    public void useSpell(Enemy enemy){
       int damage = type.getValue();
//       System.out.println(damage);
       enemy.setHealthPoints(enemy.getHealthPoints() - damage);
    }

}
