package Head10.Task5_ClassInClass;

class ExternalClass {
   private static String s = "Это поле данных типа String внешнего класса";
   private String name;
   private int number;

   class InnerClass {
      private String s = "Это поле данных типа String внутреннего класса";
      public int GetNumber() {return number++;}
   }

   public String SetName(String name) {return this.name = name;}

   @Override
   public String toString() {
      return name;
   }
}

public class ClassInClass {
   public static void main(String[] args) {
      ExternalClass ec = new ExternalClass();
      ExternalClass.InnerClass ic = ec.new InnerClass();

      ec.SetName("Чёрная дыра");
      System.out.println(ic.GetNumber());
      System.out.println(ec);
   }
}
