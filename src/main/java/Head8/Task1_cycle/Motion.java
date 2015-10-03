package Head8.Task1_cycle;

/**
 * Created by Admin on 03.10.2015.
 */

enum Direction {
    W_STRAIGHT, A_LEFT, S_BACK, D_RIGTH;
}

public class Motion {
    public static void start(Cycle cycle) {
        cycle.ride(Direction.W_STRAIGHT);
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        start(bicycle);

        Tricycle tricycle = new Tricycle();
        start(tricycle);

        Unicycle unicycle = new Unicycle();
        start(unicycle);
    }
}
