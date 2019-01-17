package players;

import behaviours.IDefend;
import behaviours.ISpell;
import behaviours.IWeapon;
import enemies.Enemy;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Mage mage;
    Enemy enemy;
    IDefend dragon;
    IWeapon weapon;
    @Before
    public void before(){
        enemy = new Troll(weapon, 15);
        mage = new Mage(dragon, SpellType.FIRE,"Thor", 20);
    }

    @Test
    public void hasSpellType(){
        assertEquals(SpellType.FIRE, mage.getSpell());
    }

    @Test
    public void hasName(){
        assertEquals("Thor", mage.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, mage.getHealthPoints());
    }

    @Test
    public void canUseSpell(){
        mage.useSpell(enemy);
        assertEquals(5, enemy.getHealthPoints());
    }

}
