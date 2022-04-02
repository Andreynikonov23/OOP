package nick.pack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Для приготовления латте, нужно: ");
        LatteMaker latteMaker = new LatteMaker();
        latteMaker.makeDrink();
        System.out.println("Для приготовления чая, нужно: ");
        TeaMaker teaMaker = new TeaMaker();
        teaMaker.makeDrink();
    }
}
