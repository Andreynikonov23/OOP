package nick.pack;

public class Goat extends Animal{
    public String toString(){
        String str = String.format("Коза: имя - %s, возраст - %d, вес - %d", getName(), getAge(), getWeight());
        return str;
    }
}
