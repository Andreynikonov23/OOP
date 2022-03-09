package nick.pack;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Bull bull = new Bull();
        Goat goat = new Goat();
        Pig pig = new Pig();
        Sheep sheep = new Sheep();
        cow.setData("Буренка", 6, 400);
        bull.setData("Аякс", 6, 700);
        goat.setData("Машка", 5, 50);
        pig.setData("Жучок", 2, 150);
        sheep.setData("Злата", 3, 40);
        System.out.println(cow);
        System.out.println(bull);
        System.out.println(goat);
        System.out.println(pig);
        System.out.println(sheep);
    }
}
