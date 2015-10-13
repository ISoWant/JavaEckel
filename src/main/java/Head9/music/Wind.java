package Head9.music;


/**
 * Created by Admin on 03.10.2015.
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {}
}
