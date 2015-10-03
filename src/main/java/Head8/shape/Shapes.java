package Head8.shape;

/**
 * Created by Admin on 03.10.2015.
 */
public class Shapes {
    private static RandomShapeGen gen = new RandomShapeGen();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];

        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }

        for (Shape shape : s) {
            shape.draw();
            shape.move();
        }
    }
}
