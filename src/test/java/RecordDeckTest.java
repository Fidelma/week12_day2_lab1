import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void setUp(){
        recordDeck = new RecordDeck("sony", "e32", 45);
    }

    @Test
    public void canGetMake() {
        assertEquals("sony", recordDeck.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("e32", recordDeck.getModel());
    }

    @Test
    public void canGetPlaySpeed() {
        assertEquals(45, recordDeck.getPlaySpeed());
    }

    @Test
    public void canChangePlaySpeed() {
        recordDeck.setPlaySpeed(75);
        assertEquals(75, recordDeck.getPlaySpeed());
    }

    @Test
    public void canPlay() {
        assertEquals("playing", recordDeck.play());
    }
}
