package nick.pack;

public class Main {
    //1. Для вывода использовать можно только переменные из класса Constants.
    //2. В классе Ferrari реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
    //3. В классе Lanos реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
    //4. Создайте public static класс LuxuriousCar(РоскошнаяМашина).
    //5. Создайте public static класс CheapCar(ДешеваяМашина).
    //6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
    //7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
    //8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
    //9. В класах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными
    //   способами модификаторы доступа так, чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.printDesire());
        Lanos lanos = new Lanos();
        System.out.println(lanos.printDesire());
    }
    public static class LuxuryCar{
        protected String printDesire(){
            return "Я хочу ездить на дорогой машине";
        }
    }
    public static class CheapCar{
        protected String printDesire(){
            return "Я хочу ездить на бюджетной машине";
        }
    }
}
