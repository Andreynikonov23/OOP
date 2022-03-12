package nick.pack.model;

import nick.pack.interfaces.Eat;
import nick.pack.interfaces.Eatable;
import nick.pack.interfaces.Moveable;

public class Tom implements Moveable, Eat, Eatable {
    @Override
    public void eat(Object obj) {
        System.out.println("Том съел " + obj);
    }

    @Override
    public void eating(Object obj) {
        System.out.println("Тома съел " + obj);
    }

    @Override
    public void move(Object obj) {
        System.out.println("Том убегает от " + obj);
    }
    public String toString(){
        String str = "Том";
        return str;
    }
}
