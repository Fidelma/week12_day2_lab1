import java.util.ArrayList;


public class Stereo {

    private String name;
    private RecordDeck recordDeck;
    private CDPlayer cdPlayer;
    private Radio radio;

    public  Stereo(String name, RecordDeck recordDeck, CDPlayer cdPlayer, Radio radio){
        this.name = name;
        this.recordDeck = recordDeck;
        this.cdPlayer = cdPlayer;
        this.radio = radio;
    }


    public String tuneRadio(String station) {
        return this.radio.tune(station);
    }

    public String playCDPlayer() {
        return this.cdPlayer.play();
    }
}
