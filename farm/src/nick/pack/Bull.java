package nick.pack;

public class Bull extends Animal {
    public String toString(){
        String str = String.format("Бычок: имя - %s, возраст - %d, вес - %d", getName(), getAge(), getWeight());
        return str;
    }
}
