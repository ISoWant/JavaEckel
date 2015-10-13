package Head8.Task1_cycle;

/**
 * Created by Admin on 03.10.2015.
 */
public class Bicycle extends Cycle {
    @Override
    public void ride(Direction key) {
        System.out.println("Bicycle.ride " + key);
        System.out.println("Bicycle has " + wheels() + " wheels");
    }

    @Override
    public int wheels() {
        return 2;
    }

    public void balance(){}
}
