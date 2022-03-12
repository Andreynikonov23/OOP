package nick.pack;

import nick.pack.model.Jerry;
import nick.pack.model.Spike;
import nick.pack.model.Tom;

public class Main {

    public static void main(String[] args) {
        Tom tom = new Tom();
        Jerry jerry = new Jerry();
        Spike spike = new Spike();
        jerry.move(tom);
        tom.eat(jerry);
        jerry.eating(tom);
        tom.move(spike);
        tom.eating(spike);
        spike.eat(jerry);
    }
}
