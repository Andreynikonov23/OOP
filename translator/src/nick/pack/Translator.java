package nick.pack;

import java.time.LocalDate;

public abstract class Translator {
    private String name;
    private int experience;
    private LocalDate birthday;

    public Translator(String name, int experience, LocalDate birthday){
        this.name = name;
        this.experience = experience;
        this.birthday = birthday;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
    public void setLanguage(LocalDate birthday){
        this.birthday = birthday;
    }
    public String getName(){
        return name;
    }
    public int age(){
        return experience;
    }
    public LocalDate getBirthday(){
        return birthday;
    }
    public String toString(){
        String str = "Я переводчик";
        return str;
    }
}
