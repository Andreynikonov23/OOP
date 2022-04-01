package nick.pack.model;


import nick.pack.Planet;

public class Earth implements Planet {
    private static Earth instance;

    private Earth(){

    }
    public static Earth getInstance(){
        if (instance == null){
            instance = new Earth();
        }
        return instance;
    }
    @Override
    public String toString(){
        return "Земля";
    }
}
