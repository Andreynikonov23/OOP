package nick.pack.task1;

import nick.pack.interfaces.Climb;
import nick.pack.interfaces.Run;

public class Cat implements Run, Climb {
    public void climb(){
        System.out.println("Кошка умеет лазить по деревьям");
    }
    public void run(){
        System.out.println("Кошка умеет бегать");
    }
}
