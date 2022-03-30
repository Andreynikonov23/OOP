package nick.pack.model;

public class RussianHen extends Hen{
    private int eggsCount = 10234;

    @Override
    public String getDescription(){
        String str = super.getDescription() + ". Моя страна: Россия, я несу " + getCountOfEggsPerMonth() + " в месяц";
        return str;
    }
}
