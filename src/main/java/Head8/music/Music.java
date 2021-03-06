package Head8.music;

import java.util.Random;

/**
 * Created by Admin on 03.10.2015.
 */
enum Note {
    MIDDLE_C, C_SHERP, B_FLAT;
}

public class Music {

    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void listAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[5];

        for (int index = 0; index < orchestra.length; index++) {
            orchestra[index] = randInstrument();
        }

        tuneAll(orchestra);
        System.out.println();
        listAll(orchestra);
    }

    public static Instrument randInstrument() {
        Random random = new Random();

        switch (random.nextInt(6)) {
            case 1: return new Brass();
            case 2: return new Percussion();
            case 3: return new Stringed();
            case 4: return new Wind();
            case 5: return new Woodwind();
            default: return new Instrument();
        }
    }

}