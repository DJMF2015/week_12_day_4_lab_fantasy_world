package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwordTest {

    Sword sword;

    @Before
    public void setUp() throws Exception {
        sword = new Sword(10, 5, "Steel");
    }

    @Test
    public void damageValue() {
        assertEquals(10, sword.damageValue());
    }

    @Test
    public void getLength() {
        assertEquals(5, sword.getLength());
    }

    @Test
    public void getMetal() {
        assertEquals("Steel", sword.getMetal());
    }
}