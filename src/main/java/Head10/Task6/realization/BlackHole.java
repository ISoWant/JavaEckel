package Head10.Task6.realization;

import Head10.Task6.Singularity;

public class BlackHole {
   private String name = "На границе чёрной дыры";

   protected class EventHorizont implements Singularity {
      private String noWorks = "законы физики теряют истиность.";
      private String violeted = "Всё, что мы знаем тут не имеет смысла.";

      public String nothingWorks() {
         return noWorks;
      }

      public String allViolated() {
         return violeted;
      }
   }

   public BlackHole() {
      System.out.println(name);
   }
}