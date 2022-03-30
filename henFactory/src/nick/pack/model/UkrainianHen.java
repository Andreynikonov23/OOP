package nick.pack.model;

public class UkrainianHen extends Hen{
    private int eggsCount = 7429;

    @Override
    public String getDescription(){
        String str = super.getDescription() + ". Моя страна: Украина, я несу " + getCountOfEggsPerMonth() + " в месяц";
        return str;
    }
}
