package nick.pack;

import java.time.LocalDate;

public class EnglishTranslator extends Translator{
    public EnglishTranslator(String name, int experience, LocalDate birthday){
        super(name, experience, birthday);
    }
    public String toString(){
        String str = super.toString() + " с английского";
        return str;
    }
}
