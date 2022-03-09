package nick.pack;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setData("Барбос", "Овчарка", 8);
        System.out.println("Собака: " + dog);
        Cat cat = new Cat();
        cat.setData("Мурзик", "Полосатый", 3);
        System.out.println("Кот: " + cat);
    }
}
