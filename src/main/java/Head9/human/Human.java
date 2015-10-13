package Head9.human;

/**
 * Created by Admin on 05.10.2015.
 */

abstract class Hum{
   public abstract void Born();
}

public class Human extends Hum {
   @Override
   public void Born(){
      System.out.println("I was born!");
   }
   public static void ref(Hum children) {
      children.Born();
   }

   public static void main(String[] args) {
      Hum ch = new Human();
      ref(ch);
   }
}

