package Head8.frog;

/**
 * Created by Admin on 04.10.2015.
 */

class Characteristic {
   private String s;

   Characteristic(String s) {
      this.s = s;
      System.out.println("Создаем Characteristic " + s);
   }
   protected void dispose() {
      System.out.println("Завершаем Characteristic " + s);
   }
}

class Description {
   private String s;

   Description(String s) {
      this.s = s;
      System.out.println("Создаём Description " + s);
   }
   protected void dispose() {
      System.out.println("Завершаем Description " + s);
   }
}

class LivingCreature {
   private Characteristic p = new Characteristic("живое существо");
   private Description t = new Description("обычное живое существо");
   LivingCreature() {
      System.out.println("LivingCreature()");
   }
   protected void dispose() {
      System.out.println("dispose() в LivingCreature ");
      t.dispose();
      p.dispose();
   }
}

class Animal extends LivingCreature {
   private Characteristic p = new Characteristic("имеет сердце");
   private Description t = new Description("Животное, не растение");
   Animal() {
      System.out.println("Animal()");
   }
   protected void dispose() {
      System.out.println("dispose() в Animal ");
      t.dispose();
      p.dispose();
      super.dispose();
   }
}

class Amphibian extends Animal {
   private Characteristic p = new Characteristic("может жить в воде");
   private Description t = new Description("и в воде, и на земле");
   Amphibian() {
      System.out.println("Amphibian()");
   }
   protected void dispose() {
      System.out.println("dispose() в Amphibian ");
      t.dispose();
      p.dispose();
      super.dispose();
   }
}

public class Frog extends Amphibian {
   private Characteristic p = new Characteristic("квакает");
   private Description t = new Description("ест жуков");
   public Frog() {
      System.out.println("Frog()");
   }
   protected void dispose() {
      System.out.println("завершение Frog");
      t.dispose();
      p.dispose();
      super.dispose();
   }

   public static void main(String[] args) {
      Frog frog = new Frog();
      System.out.println("Пока!");
      frog.dispose();
   }
}
