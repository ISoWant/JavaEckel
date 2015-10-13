package Head9.Task13_interface;

/**
 * Created by Admin on 10.10.2015.
 */
public class CheckThisInterface implements EndInterface {
   public void mainI() {
      System.out.println("This is function of Main Interface");
   }

   public void firstI() {
      System.out.println("This is function of First Interface which depends on the Main Interface");
   }

   public void secondI() {
      System.out.println("This is function of Second Interface which depends on the Main Interface");
   }

   public void EndI() {
      System.out.println("This is function of End Interface which depends on the First and Second Interfaces");
   }

   public static void main(String[] args) {
      CheckThisInterface c = new CheckThisInterface();

      c.mainI();
      c.firstI();
      c.secondI();
      c.EndI();
   }
}

