package Head8.staticPolymorphism;

/**
 * Created by Admin on 04.10.2015.
 */

class StaticSuper {
    public static String staticGet() {
        return "Базовая версия staticGet()";
    }

    public String dynamicGet() {
        return "Базовая версия dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Производная версия staticGet()";
    }

    @Override
    public String dynamicGet() {
        return "Производная версия dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
