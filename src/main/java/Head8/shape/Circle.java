package Head8.shape;

/**
 * Created by Admin on 03.10.2015.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void move() {
        System.out.println("Circle.move()");
    }
}
