package nick.pack;

public class Cat extends Pets{
    public Cat (String name, String breed, int age){
        super(name, breed, age);
    }
    public String toString(){
        String str = "Кот: " + super.toString();
        return str;
    }
}
