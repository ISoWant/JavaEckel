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

        Cycle[] cysles = {new Unicycle(),
            new Bicycle(), new Tricycle()};
        //cycles[0].balance(); не пашет, так как нету нисходящего преобразования
        //а изначально в классе Cycle метод balance() не объявлен
        ((Unicycle)cysles[0]).balance();
        ((Bicycle)cysles[1]).balance();
    }
}
