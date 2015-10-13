package Head8.polyConstructors;

/**
 * Created by Admin on 05.10.2015.
 */

class Glyph {
   void draw() {
      System.out.println("Glyph.draw()");
   }
   Glyph() {
      System.out.println("Glyph() перед вызовом draw()");
      draw();
      System.out.println("Glyph() после вызова draw()");
   }
}

class RoundGlyph extends Glyph {
   private int radius = 1;

   RoundGlyph(int r) {
      radius = r;
      System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
   }

   @Override
   void draw() {
      System.out.println("RoundGlyph.draw(), radius = " + radius);
   }
}

class RectangularGlyph extends Glyph {
   private int side = 1;

   RectangularGlyph(int r) {
      side = r;
      System.out.println("RectangularGlyph(), side = " + side);
   }

   @Override
   void draw() {
      System.out.println("RectangularGlyph.draw(), side = " + side);
   }
}

public class PolyConstructors {
   public static void main(String[] args) {
      new RoundGlyph(5);
      new RectangularGlyph(4);
   }
}
