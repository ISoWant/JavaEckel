package Head8.shape;

/**
 * Created by Admin on 03.10.2015.
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void move() {
        System.out.println("Square.move()");
    }
}
