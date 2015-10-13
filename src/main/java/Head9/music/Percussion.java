package Head9.music;

/**
 * Created by Admin on 03.10.2015.
 */
public class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {}
}
