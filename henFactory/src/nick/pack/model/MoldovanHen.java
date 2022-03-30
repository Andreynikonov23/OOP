package nick.pack.model;

public class MoldovanHen extends Hen {
    private int eggsCount = 2821;

    @Override
    public String getDescription(){
        String str = super.getDescription() + ". Моя страна: Молдавия, я несу " + getCountOfEggsPerMonth() + " в месяц";
        return str;
    }
}
