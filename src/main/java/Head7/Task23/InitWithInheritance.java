package Head7.Task23;

/**
 * Created by Admin on 03.10.2015.
 * Данный модуль дублирует текст программы из книги Б. Эккеля "Философия Java" 4-ое издание
 * Глава 7, стр. 234
 */

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 =
            printInit("Поле static Head7.Task23.Insect.x1 инициализировано");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

/**
 * Класс создан для доказательства что, загрузка класса может быть вызвана при обращении к статическому члену класса
 * Второе задание 23 задачи.
 */
class Download extends Insect {
    private static int x3 =
            printInit("Поле static Head7.Task23.Download.x3 инициализированно");
    public static int j = 5;
}

public class InitWithInheritance extends Insect {
    private int k = printInit("Поле Head7.Task23.InitTask23.k инициализированно");
    public InitWithInheritance() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 =
            printInit("Поле static Head7.Task23.InitTask23.x2 инициализировано");

    public static void main(String[] args) {
        System.out.println("Конструктор Head7.Task23.InitTask23");
        InitWithInheritance i = new InitWithInheritance(); //оригинальный текст

        System.out.println("_________________________________");
        System.out.println("Демонстрация, что загрузка класса выполняется только один раз");
        InitWithInheritance init = new InitWithInheritance(); //Первое задание 23 задачи.

        System.out.println("_________________________________");
        System.out.println("Это доказывает, что загрузка может быть вызвана обращение к статическому члену класса.");
        int a = Download.j; //Второе задание 23 задачи
    }
}
