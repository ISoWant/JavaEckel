package Head8.Task9_rodent;

/**
 * Created by Admin on 04.10.2015.
 */
public class Mouse extends Rodent {
    private static long id = 0;
    @Override
    public void move() {
        System.out.println("Mouse makes a move");
    }

    @Override
    public void specialEffects() {
        System.out.println("Выйти наружу и превратиться в крысу");
    }

    Mouse() {
        System.out.println("Мышка " + id++ + " появилась на свет");
        addRef();
    }

    @Override
    public void dispose() {
        System.out.println("Мышка " + id-- + " перешла на следующий уровень");
        super.dispose();
    }
}
