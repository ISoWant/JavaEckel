package Head9.factories;

/**
 * Created by Admin on 11.10.2015.
 */

interface Service {
   void method1();
   void method2();
}

interface ServiceFactory {
   Service getService();
}

class Imp1 implements Service {
   Imp1(){}

   public void method1() {
      System.out.println("Imp1 method1");
   }

   public void method2() {
      System.out.println("Imp1 method2");
   }
}

class Imp1Factory implements ServiceFactory {
   public Service getService() {
      return new Imp1();
   }
}

class Imp2 implements Service {
   Imp2(){}

   public void method1() {
      System.out.println("Imp2 method1");
   }

   public void method2() {
      System.out.println("Imp2 method2");
   }
}

class Imp2Factory implements ServiceFactory {
   public Service getService() {
      return new Imp2();
   }
}

public class Factories {
   public static void serviceConsumer(ServiceFactory fact) {
      Service s = fact.getService();
      s.method1();
      s.method2();
   }


   public static void main(String[] args) {
      serviceConsumer(new Imp1Factory());
      serviceConsumer(new Imp2Factory());
   }
}
