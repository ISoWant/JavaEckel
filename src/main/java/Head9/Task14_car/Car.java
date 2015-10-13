package Head9.Task14_car;

/**
 * Created by Admin on 10.10.2015.
 */

interface Wheels {
   void rotate();
   void concatenates();
}

interface Doors {
   void close();
   void open();
}

interface Engine {
   void convert();
   void moves();
}

interface Machine extends Wheels, Doors, Engine {
   void works();
}

abstract class Auto {
   private static long count = 0;

   Auto() {
      count++;
      System.out.println(count);
   }
}

public class Car extends Auto implements Machine {
   public void rotate() {
      System.out.println("This car has 4 wheels. And they rotate");
   }

   public void concatenates() {
      System.out.println("Going clutch");
   }

   public void close() {
      System.out.println("closed");
   }

   public void open() {
      System.out.println("open");
   }

   public void convert() {
      System.out.println("convert");
   }

   public void moves() {
      System.out.println("moves");
   }

   public void works() {
      System.out.println("this works");
   }



   public static void main(String[] args) {
      Car car = new Car();
      car.close();
      car.concatenates();
      car.convert();
      car.moves();
      car.open();
      car.rotate();
      car.works();
   }
}
