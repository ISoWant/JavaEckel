package Head9.randomWords;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Admin on 10.10.2015.
 */
public class RandomWords implements Readable {
   private static Random rand = new Random();
   private static final char[] capitals =
           "ABCDEFGIHJKLMNOPQRSTUVWXYZ".toCharArray();
   private static final char[] lowers =
           "abcdefgihjklmnopqrstuvwxyz".toCharArray();
   private static final char[] vowels =
           "aeiou".toCharArray();
   private int count;
   public RandomWords(int count) {this.count = count;}

   public int read(CharBuffer cb) {
      if (count-- == 0) return -1;

      cb.append(capitals[rand.nextInt(capitals.length)]);
      for (int i = 0; i < 4; i++) {
         cb.append(vowels[rand.nextInt(vowels.length)]);
         cb.append(lowers[rand.nextInt(lowers.length)]);
      }
      cb.append(" ");
      return 10;
   }

   public static void main(String[] args) {
      Scanner s = new Scanner(new RandomWords(10));

      while (s.hasNext()) System.out.println(s.next());
   }
}
