package nick.pack;

public class Main{
    //1. Создайте класс Cat
    //2. Внутри Cat создайте поле класса String name = "Пушок"
    //3. Создайте объект класса Cat - myCat
    //4. Присвойте статическому объекту Object cat объект, созданный в п.3
    //5. Выведите в консоль myCat.name
    private static Object cat;
    static {
        class Cat{
            public final String NAME = "Пушок";

            @Override
            public String toString(){
                return NAME;
            }
        }
        Cat myCat = new Cat();
        cat = myCat;
    }
    public static void main(String[] args){
        System.out.println(cat);
    }
}
