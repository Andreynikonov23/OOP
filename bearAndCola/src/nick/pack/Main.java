package nick.pack;

import nick.pack.interfaces.DrinkEnough;
import nick.pack.interfaces.DrinkSome;
import nick.pack.model.Bear;
import nick.pack.model.Cola;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите выпить?");
        System.out.println("1. Да");
        System.out.println("2. Нет");

        boolean isFalse = false;
        while (true){
            String str = scanner.nextLine();
                if (str.equalsIgnoreCase("Да")){
                    isFalse = true;
                    break;
                } else if (str.equalsIgnoreCase("Нет")){
                    System.out.println("Хорошо");
                    break;
                } else
                    System.out.println("Непонял! Повторите пожалуйста");
        }
        if (isFalse == true){
            System.out.println("Что вы хотите выпить");
            System.out.println("1. Пиво");
            System.out.println("2. Кола");
            while (true){
                String str = scanner.nextLine();
                if (str.equalsIgnoreCase("Пиво")){
                    DrinkEnough drinkBear = new Bear();
                    drinkBear.drink();
                    break;
                } else if (str.equalsIgnoreCase("Кола")){
                    DrinkEnough drinkCola = new Cola();
                    drinkCola.drink();
                    break;
                } else
                    System.out.println("Непонял! Повторите еще раз");
            }
        }
    }
}
