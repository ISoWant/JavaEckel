package Head8.sandwich;

/**
 * Created by Admin on 04.10.2015.
 */

class Meal {
   Meal() {
      System.out.println("Meal()");
   }
}

class Bread {
   Bread() {
      System.out.println("Bread()");
   }
}

class Cheese {
   Cheese() {
      System.out.println("Cheese()");
   }
}

class Lettuce {
   Lettuce() {
      System.out.println("Lettuce()");
   }
}

class Pickle {
   Pickle() {
      System.out.println("Pickle()");
   }
}

class Lunch extends Meal {
   Lunch(int i) {
      for (int j = 0; j < i; j++) {
         System.out.println("Lunch()");
      }
   }
}

class PortableLunch extends Lunch {
   PortableLunch() {
      super(5);//Конструктор базового класса требует аргумент
      System.out.println("PortableLunch()");
   }
}

public class Sandwich extends PortableLunch {
   private Bread b = new Bread();
   private Cheese c = new Cheese();
   private Lettuce l = new Lettuce();
   private Pickle p = new Pickle();

   static int i = checkStatic();

   private static int checkStatic(){
      System.out.println("Инициализировал static");
      return 11;
   }

   public Sandwich() {
      System.out.println("Sandwich()");
   }

   public static void main(String[] args) {
      new Sandwich();
   }
}
