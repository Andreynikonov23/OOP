package nick.pack.model;


import nick.pack.Planet;

public class Moon implements Planet {
    private static Moon instance;

    private Moon(){

    }
    public static Moon getInstance(){
        if (instance == null){
            instance = new Moon();
        }
        return instance;
    }
    @Override
    public String toString(){
        return "Луна";
    }
}
