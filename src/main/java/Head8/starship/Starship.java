package Head8.starship;

import javafx.animation.Animation;

/**
 * Created by Admin on 05.10.2015.
 */
class AlertStatus {
   public void Status(){}
}

class AllRight extends AlertStatus {
   @Override
   public void Status() {
      System.out.println("AllRight");
   }
}

class Attantion extends AlertStatus {
   @Override
   public void Status() {
      System.out.println("Attention");
   }
}

class Critical extends AlertStatus {
   @Override
   public void Status() {
      System.out.println("Critical");
   }
}

class Situation {
   private AlertStatus status = new AllRight();
   private static int nStatus = 0;
   public void changeSituation() {
      if (nStatus == 0) {
         nStatus++;
         status = new Attantion();
      } else {
         status = new Critical();
      }
   }
   public void perfom() {
      status.Status();
   }
}

public class Starship {
   public static void main(String[] args) {
      Situation situation = new Situation();
      situation.perfom();
      situation.changeSituation();
      situation.perfom();
      situation.changeSituation();
      situation.perfom();
   }
}
