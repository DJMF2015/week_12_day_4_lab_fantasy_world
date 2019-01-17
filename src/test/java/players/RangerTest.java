package players;

import players.Ranger;
import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;
import weapons.Bow;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class RangerTest {

    Ranger ranger;
    IWeapon sword;
    IWeapon bow;


    @Before
    public void before(){
        sword = new Sword(10, 5, "Steel");
        bow = new Bow(5, "Composite", 50);
        ranger = new Ranger(sword, "Aragorn", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Aragorn", ranger.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, ranger.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals(sword, ranger.getWeapon());
    }

    @Test
    public void canSetHealthPoints(){
        ranger.setHealthPoints(90);
        assertEquals(90, ranger.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        assertEquals(sword, ranger.getWeapon());
        ranger.setWeapon(bow);
        assertEquals(bow, ranger.getWeapon());
    }


}

