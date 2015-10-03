package Head8.Task1_cycle;

/**
 * Created by Admin on 03.10.2015.
 */
public class Tricycle extends Cycle {
    @Override
    public void ride(Direction key) {
        System.out.println("Tricycle.ride " + key);
        System.out.println("Tricycle has " + wheels() + " wheels");
    }

    @Override
    public int wheels() {
        return 3;
    }
}
