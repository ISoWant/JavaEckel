package Head9.adventure;

/**
 * Created by Admin on 10.10.2015.
 */

interface CanFight {void fight();}

interface CanSwim {void swim();}

interface CanFly {void fly();}

interface CanAction extends CanFly, CanFight, CanSwim {}

interface CanClimb {void climb();}

class ActionCharacter {public void fight() {}}

class Hero extends ActionCharacter
        implements CanAction, CanClimb {
   public void climb() {}
   public void fly() {}
   public void swim() {}
}
public class Adventure {
   public static void t(CanFight x) {x.fight();}
   public static void u(CanSwim x) {x.swim();}
   public static void v(CanFly x) {x.fly();}
   public static void c(CanClimb x) {x.climb();}
   public static void w(ActionCharacter x) {x.fight();}

   public static void main(String[] args) {
      Hero h = new Hero();
      t(h);
      u(h);
      v(h);
      c(h);
      w(h);
   }
}
