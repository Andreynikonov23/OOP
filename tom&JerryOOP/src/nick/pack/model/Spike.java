package nick.pack.model;

import nick.pack.interfaces.Eat;

public class Spike implements Eat {
    @Override
    public void eat(Object obj) {
        System.out.println("Спайк съел " + obj);
    }
    public String toString(){
        String str = "Спайк";
        return str;
    }
}
