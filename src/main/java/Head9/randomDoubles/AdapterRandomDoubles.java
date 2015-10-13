package Head9.randomDoubles;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Admin on 10.10.2015.
 */

class RandomDoubles {
   private static Random rand = new Random();
   public double next() {return rand.nextDouble();}

   public static void main(String[] args) {
      RandomDoubles rd = new RandomDoubles();
      for (int i = 0; i < 7; i++) {
         System.out.println(rd.next() + " ");
      }
   }
}

public class AdapterRandomDoubles extends RandomDoubles
        implements Readable {
   private int count;

   public AdapterRandomDoubles(int count) {
      this.count = count;
   }

   public int read(CharBuffer cb) {
      if (count-- == 0) return -1;
      String result = Double.toString(next()) + " ";
      cb.append(result);
      return result.length();
   }

   public static void main(String[] args) {
      Scanner s = new Scanner(new AdapterRandomDoubles(7));
      while (s.hasNextDouble()) {
         System.out.print(s.nextDouble() + " ");
      }
   }

}
