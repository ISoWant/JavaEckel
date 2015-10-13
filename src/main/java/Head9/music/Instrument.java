package Head9.music;


/**
 * Created by Admin on 03.10.2015.
 */

abstract class Instrument {
    private int i;
    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}
