package nick.pack.model;

import nick.pack.interfaces.Eatable;
import nick.pack.interfaces.Moveable;

public class Jerry implements Moveable, Eatable {

    @Override
    public void eating(Object obj) {
        System.out.println("Джерри был съеден " + obj);
    }

    @Override
    public void move(Object obj) {
        System.out.println("Джерри убегает от " + obj);
    }
    public String toString(){
        String str = "Джерри";
        return str;
    }
}
