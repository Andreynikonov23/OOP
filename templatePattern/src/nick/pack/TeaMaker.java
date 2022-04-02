package nick.pack;

public class TeaMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("1.Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("2.Насыпаем чай");
    }

    @Override
    void pour() {
        System.out.println("3.Заливаем водой");
    }
}
