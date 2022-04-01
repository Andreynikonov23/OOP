package nick.pack.model;

import nick.pack.Planet;

public class Sun implements Planet {
    private static Sun instance;


    private Sun(){

    }
    public static Sun getInstance(){
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }
    @Override
    public String toString(){
        return "Солнце";
    }
}
