package Head8.covariantReturn;

/**
 * Created by Admin on 05.10.2015.
 */

class Grain {
   public String toString() {
      return "Grain";
   }
}

class Wheat extends Grain {
   public String toString() {
      return "Wheat";
   }
}

class Mill {
   Grain process() {
      return new Grain();
   }
}

class WheatMill extends Mill {
   @Override
   Wheat process() {
      return new Wheat();
   }
}

public class CovariantReturn {
   public static void main(String[] args) {
      Mill m = new Mill();
      Grain g = m.process();
      System.out.println(g);
      m = new WheatMill();
      g = m.process();
      System.out.println(g);
   }
}
