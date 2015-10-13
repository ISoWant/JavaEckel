package Head8.Task9_rodent;

/**
 * Created by Admin on 04.10.2015.
 */
public class Hamster extends Rodent {
    private static long id = 0;
    @Override
    public void move() {
        System.out.println("Hamster makes a move");
    }

    @Override
    public void specialEffects() {
        System.out.println("Набить еду за щёки");
    }

    Hamster() {
        System.out.println("В этом мире появился хомяк " + id++);
        addRef();
    }

    @Override
    public void dispose() {
        System.out.println("Хомяк " + id-- + " перешёл на следующий уровень");
        super.dispose();
    }
}
