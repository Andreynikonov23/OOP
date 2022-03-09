package nick.pack;

public class Sheep extends Animal{
    public String toString(){
        String str = String.format("Овечка: имя - %s, возраст - %d, вес - %d", getName(), getAge(), getWeight());
        return str;
    }
}
