package EnemiesTest;

import behaviours.IWeapon;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.Ranger;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    IWeapon axe;
    Player player;

    @Before
    public void before() {
        axe = new Axe(12, "waraxe", 3);
        troll = new Troll(axe, 20);
        player = new Ranger(axe, "Bilbo", 20);
    }

    @Test
    public void getHealthPoints() {
        assertEquals(20, troll.getHealthPoints());
    }

    @Test
    public void getCanGetWeapon() {
        assertEquals(axe, troll.getWeapon());
    }

    @Test
    public void canAttackPlayer(){
        troll.attack(player);
        assertEquals(8, player.getHealthPoints());
    }
}