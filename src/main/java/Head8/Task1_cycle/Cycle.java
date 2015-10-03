package Head8.Task1_cycle;

/**
 * Created by Admin on 03.10.2015.
 */
public class Cycle {
    public void ride(Direction key) {
        System.out.println("Cycle.ride" + key);
        System.out.println("wheels = " + wheels());
    }

    public int wheels() {
        return 4;
    }
}
