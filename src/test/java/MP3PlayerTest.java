import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    MP3Player mp3Player;
    Stereo stereo;
    RecordDeck recordDeck;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void setUp(){
        mp3Player = new MP3Player();
        recordDeck = new RecordDeck("sony", "e54", 45);
        cdPlayer = new CDPlayer("sony", "e32", 5);
        radio = new Radio();
        stereo = new Stereo("Mine", recordDeck, cdPlayer, radio);
    }

    @Test
    public void canConnect() {
        assertEquals("Mine", mp3Player.connect(stereo));

    }
}
