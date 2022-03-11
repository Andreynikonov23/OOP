package nick.pack.task1;


import nick.pack.interfaces.Climb;
import nick.pack.interfaces.Run;

public class Leon implements Run, Climb {
  public void run(){
      System.out.println("Лев умеет бегать");
  }
  public void climb(){
      System.out.println("Лев умеет лазить по деревьям");
  }
}
