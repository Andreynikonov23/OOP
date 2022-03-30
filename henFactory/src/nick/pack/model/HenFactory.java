package nick.pack.model;

public class HenFactory {
    public static String getHen(Object obj){
        String str = null;
        if (obj instanceof RussianHen){
            str = "Россия: Ломан Браун";
        }
        if (obj instanceof UkrainianHen){
            str = "Украина: Гамбургская";
        }
        if (obj instanceof BelarusianHen){
            str = "Беларусь: Кучинская юбилейная";
        }
        if (obj instanceof MoldovanHen){
            str = "Молдавия: Загорская лососевая";
        }
        return str;
    }
}
