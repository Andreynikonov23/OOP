package nick.pack.model;

public abstract class Hen {
    private int eggsCount;

    public void setEggsCount(int eggsCount){
        this.eggsCount = eggsCount;
    }
    public int getCountOfEggsPerMonth(){
        return eggsCount;
    }
    public String getDescription(){
        String str = "Я курица";
        return str;
    }
}
