package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowTest {

    Bow bow;

    @Before
    public void setUp() throws Exception {
        bow = new Bow(5, "Long", 50);
    }

    @Test
    public void hasDamageValue() {
        assertEquals(5, bow.damageValue());
    }

    @Test
    public void hasType(){
        assertEquals("Long", bow.getBowType());
    }

    @Test
    public void hasDistance(){
        assertEquals(50, bow.getDistance());
    }
}