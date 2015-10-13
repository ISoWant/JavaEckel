package Head9.Task3_Trees;

/**
 * Created by Admin on 05.10.2015.
 */

abstract class Tree {
   abstract void print();
   Tree() {
      print();
   }
}

class Brich extends Tree {
   private int numberOfLeaves = 879645;

   @Override
   void print() {
      System.out.println(numberOfLeaves);
   }
}

public class Trees {
   public static void main(String[] args) {
      Brich br = new Brich();
      br.print();
   }
}
