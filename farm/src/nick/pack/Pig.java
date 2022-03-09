package nick.pack;

public class Pig extends Animal {
    public String toString(){
        String str = String.format("Поросенок: имя - %s, возраст - %d, вес - %d", getName(), getAge(), getWeight());
        return str;
    }
}
