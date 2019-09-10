import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void setUp(){
        cdPlayer = new CDPlayer("sony", "e32", 5);
    }

    @Test
    public void canGetMake() {
        assertEquals("sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("e32", cdPlayer.getModel());
    }

    @Test
    public void canGetNumberOfCDs() {
        assertEquals(5, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void canChangeNumberOfCDs() {
        cdPlayer.setNumberOfCDs(75);
        assertEquals(75, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void canPlay() {
        assertEquals("playing", cdPlayer.play());
    }
}
