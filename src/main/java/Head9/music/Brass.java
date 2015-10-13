package Head9.music;


/**
 * Created by Admin on 03.10.2015.
 */
public class Brass extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    public void adjust() {}
}
