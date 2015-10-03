package Head8.shape;

import java.util.Random;

/**
 * Created by Admin on 03.10.2015.
 */
public class RandomShapeGen {
    private Random rand = new Random();
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
