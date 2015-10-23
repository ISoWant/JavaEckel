package Head10.Task6.call;

import Head10.Task6.Singularity;
import Head10.Task6.realization.BlackHole;

public class Destination extends BlackHole {
   public static void main(String[] args) {
      BlackHole bh = new BlackHole();
      Singularity eh = bh.new EventHorizont();
   }
}
