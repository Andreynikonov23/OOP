package nick.pack.task1;

import nick.pack.interfaces.Climb;
import nick.pack.interfaces.Run;

public class Tiger implements Run, Climb {
    public void run(){
        System.out.println("Тигр умеет бегать");
    }
    public void climb(){
        System.out.println("Тигр умеет лазить по деревьям");
    }
}
