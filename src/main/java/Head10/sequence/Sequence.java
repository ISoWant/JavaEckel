package Head10.sequence;

interface Selector {
   boolean end();
   Object current();
   void next();
}

public class Sequence {
   private Object[] items;
   private int next = 0;
   public Sequence(int size) { items = new Object[size]; }

   public void add(Object x) {
      if (next < items.length) {
         items[next++] = x;
      }
   }

   private class SequenceSelector implements Selector {
      private int i = 0;

      public boolean end() {
         return i == items.length;
      }

      public Object current() {
         return items[i];
      }

      public void next() {
         if (i < items.length) i++;
      }

      public Sequence Sequencelink() {return Sequence.this;}
   }

   public Selector selector() {
      return new SequenceSelector();
   }

   class GetStrings {
      public String textLine = "Шоколадка, ммм =)";

      @Override
      public String toString() {
         return textLine;
      }
   }

   @Override
   public String toString() {
      return "Это toString для класса Sequence";
   }

   public static void main(String[] args) {
      Sequence sequence = new Sequence(10);


      for (int i = 0; i < 10; i++) {
         sequence.add(Integer.toString(i));
      }

      Selector selector = sequence.selector();

      while (!selector.end()) {
         System.out.print(selector.current() + " ");
         selector.next();
      }

      GetStrings gs = sequence.new GetStrings();
      GetStrings getS = sequence.new GetStrings();

      System.out.println(gs);
      System.out.println(getS);

      SequenceSelector sr = (SequenceSelector) sequence.selector();

      System.out.println(sr.Sequencelink());
   }
}
