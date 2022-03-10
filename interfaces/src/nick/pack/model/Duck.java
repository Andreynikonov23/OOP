package nick.pack.model;

import nick.pack.interfaces.Eat;
import nick.pack.interfaces.Fly;
import nick.pack.interfaces.Swim;

public class Duck implements Fly, Eat, Swim {
    public void fly(){
        System.out.println("Утка умеет летать");
    }
    public void eat(){
        System.out.println("Утку нужно кормить");
    }
    public void swim(){
        System.out.println("Утка умеет плавать");
    }
}
