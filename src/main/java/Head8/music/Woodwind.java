package Head8.music;

/**
 * Created by Admin on 03.10.2015.
 */
public class Woodwind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}
