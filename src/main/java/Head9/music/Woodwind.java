package Head9.music;


/**
 * Created by Admin on 03.10.2015.
 */
public class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}
