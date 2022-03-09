package nick.pack;

public class Pets {
    private String name;
    private String breed;
    private int age;


    public void setData(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        String str = String.format("Имя - %s, Порода - %s, Возраст - %d", name, breed, age);
        return str;
    }
}
