package nick.pack;

public class LatteMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("1.Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("2.Добавляем кофе");
    }

    @Override
    void pour() {
        System.out.println("3.Заливаем молоком с пенкой");
    }
}
