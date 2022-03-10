package nick.pack.model;

import nick.pack.interfaces.Eat;
import nick.pack.interfaces.Run;

public class Dog implements Run, Eat {
    public void run(){
        System.out.println("Собака умеет бегать");
    }
    public void eat(){
        System.out.println("Собаку нужно кормить");
    }
}
