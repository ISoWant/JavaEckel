package Head7.Task24;

/**
 * Created by Admin on 03.10.2015.
 * Данный модуль дублирует текст программы из книги Б. Эккеля "Философия Java" 4-ое издание
 * Глава 7, стр. 234 и содержит изменения необходимые для решения 24 задания
 */

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 =
            printInit("Поле static Insect.x1 инициализировано");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

 class InitTask23 extends Insect {
    private int k = printInit("Поле InitTask23.k инициализированно");
    public InitTask23() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 =
            printInit("Поле static InitTask23.x2 инициализировано");
}

public class Task24 extends InitTask23 {
    private int k = printInit("Поле Task24.k инициализированно");
    public Task24() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x3 =
            printInit("Поле static Task24.x3 инициализировано");

    public static void main(String[] args) {
        System.out.println("Конструктор Task24");
        Task24 i = new Task24();
    }
}
