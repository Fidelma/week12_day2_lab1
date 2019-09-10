import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    RecordDeck recordDeck;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void setUp(){
        recordDeck = new RecordDeck("sony", "e54", 45);
        cdPlayer = new CDPlayer("sony", "e32", 5);
        radio = new Radio();
        stereo = new Stereo("Mine", recordDeck, cdPlayer, radio);
    }

    @Test
    public void canTuneRadio() {

        assertEquals("Tuning to Radio 1",stereo.tuneRadio("Radio 1"));
    }

    @Test
    public void canPlayCd() {
        assertEquals("playing", stereo.playCDPlayer());
    }
}
