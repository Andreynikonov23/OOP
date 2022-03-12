package nick.pack;

import java.time.LocalDate;

public class GermanTranslator extends Translator{

    public GermanTranslator(String name, int age, LocalDate birthday) {
        super(name, age, birthday);
    }
    public String toString(){
        String str = super.toString() + " с немецкого";
        return str;
    }
}
