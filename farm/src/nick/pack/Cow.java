package nick.pack;

public class Cow extends Animal{
    public String toString(){
        String str = String.format("Корова: имя - %s, возраст - %d, вес - %d", getName(), getAge(), getWeight());
        return str;
    }
}
