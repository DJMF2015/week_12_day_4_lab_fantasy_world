package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

    Axe axe;

    @Before
    public void setUp() throws Exception {
        axe = new Axe(12, "BattleAxe", 2);
    }

    @Test
    public void getAxeType() {
        assertEquals("BattleAxe", axe.getAxeType());
    }

    @Test
    public void getWeight() {
        assertEquals(2, axe.getWeight());
    }

    @Test
    public void damageValue() {
        assertEquals(12, axe.damageValue());
    }
}