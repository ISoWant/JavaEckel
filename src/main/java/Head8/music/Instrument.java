package Head8.music;

/**
 * Created by Admin on 03.10.2015.
 */

public class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play ");
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
