package nick.pack;

public class Dog extends Pets{
    public Dog (String name, String breed, int age){
        super(name, breed, age);
    }
    public String toString(){
        String str = "Собака: " + super.toString();
        return str;
    }
}
