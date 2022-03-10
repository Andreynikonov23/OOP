package nick.pack;

import nick.pack.interfaces.Eat;
import nick.pack.interfaces.Fly;
import nick.pack.interfaces.Run;
import nick.pack.interfaces.Swim;
import nick.pack.model.*;

public class Main {

    public static void main(String[] args) {
        Fly duckFly = new Duck();
        duckFly.fly();
        Fly planeFly = new Airplane();
        planeFly.fly();
        Run carRun = new Car();
        carRun.run();
        Run dogRun = new Dog();
        dogRun.run();
        Swim duckSwim = new Duck();
        duckSwim.swim();
        Eat duckEat = new Duck();
        duckEat.eat();
        Eat dogEat = new Dog();
        dogEat.eat();
    }
}
