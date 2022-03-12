package nick.pack;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    EnglishTranslator englishTranslator = new EnglishTranslator("Андрей", 2, LocalDate.of(2001, 9, 13));
        System.out.println(englishTranslator);
    }
}
