package nick.pack;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow();
        Cow cow1 = new Whale();
        Whale whale = new Whale();
        Dog dog = new Dog();
        Human human = new Human();
        check(cow);
        check(cow1);
        check(whale);
        check(dog);
        check(human);
    }
    public static void check(Object obj){
        if (obj instanceof Cow){
            System.out.println("Это корова");
        } else if (obj instanceof Whale){
            System.out.println("Это кит");
        }else if (obj instanceof Dog){
            System.out.println();
        } else
            System.out.println("Это неизвестное животное");
    }
}
