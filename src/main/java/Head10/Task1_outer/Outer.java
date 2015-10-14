package Head10.Task1_outer;

public class Outer {
   private static long count = 0;

   public Outer() {
      System.out.println("Создан новый объект типа Outer");
      count++;
      System.out.println("Итого, было созданно уже " + count);
   }

   class Inner {
      public Inner() {
         System.out.println("Создан новый объект типа Inner");
      }
   }

   public Inner getInner() {
      return new Inner();
   }

   public static void main(String[] args) {
      Outer outer = new Outer();
      Inner check = outer.getInner();
   }
}
