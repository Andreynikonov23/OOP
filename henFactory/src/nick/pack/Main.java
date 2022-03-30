package nick.pack;

import nick.pack.model.*;

public class Main {
    /*
    Написать Фабрику(Factory) по производству кур(Hen)
    1. Создать класс Hen
    1.1. Сделать его абстрактным
    1.2. Добавить в класс абстрактный метод int getCountOfEggsPerMonth()
    1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."

    2. Создать класс RussianHen, который наследуется от Hen
    3. Создать класс UkrainianHen, который наследуется от Hen
    4. Создать класс MoldovanHen, который наследуется от Hen
    5. Создать класс BelarusianHen, который наследуется от Hen

    6. В каждом из четырех последних классов написать
    свою реализацию метода getCountOfEggsPerMonth.
    Методы должны возвращать количество яиц в месяц от данного типа куриц.

    7. В каждом из четырех последних классов
    написать свою реализацию метода getDescription.
    Методы должны возвращать строку вида:
    <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">;
    где Sssss - название страны
    где N - количество яиц в месяц

    8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур
     */
    public static void main(String[] args) {
        RussianHen russianHen = new RussianHen();
        russianHen.setEggsCount(8953);
        BelarusianHen belarusianHen = new BelarusianHen();
        belarusianHen.setEggsCount(6361);
        MoldovanHen moldovanHen = new MoldovanHen();
        moldovanHen.setEggsCount(2611);
        UkrainianHen ukrainianHen = new UkrainianHen();
        ukrainianHen.setEggsCount(5932);
        System.out.println(russianHen.getDescription());
        System.out.println(belarusianHen.getDescription());
        System.out.println(moldovanHen.getDescription());
        System.out.println(ukrainianHen.getDescription());
        System.out.println(HenFactory.getHen(russianHen));
        System.out.println(HenFactory.getHen(belarusianHen));
        System.out.println(HenFactory.getHen(moldovanHen));
        System.out.println(HenFactory.getHen(ukrainianHen));
    }
}
