package nick.pack.model;

public class BelarusianHen extends Hen{
    private int eggsCount;

    @Override
    public String getDescription(){
        String str = super.getDescription() + ". Моя страна: Беларусь, я несу " + getCountOfEggsPerMonth() + " в месяц";
        return str;
    }
}
