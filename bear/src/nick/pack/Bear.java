package nick.pack;

import java.util.Scanner;

public class Bear implements DrinkEnough{
    private boolean action;
    private boolean goHome;
    private static Scanner scanner = new Scanner(System.in);
    private String str;
    private int count = 0;
    public void drink(){
        System.out.println("Хотите выпить немного пива?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        str = scanner.nextLine();
        while (true){
            if (str.equalsIgnoreCase("Да")){
                drinkMore();
                break;
            } else if (str.equalsIgnoreCase("Нет")){
                System.out.println("Хорошо");
                break;
            } else
                System.out.println("Непонял! Повторите пожалуйста");
        }
    }
    public void isReadyToGoHome(){
        System.out.println("Хотите пойти домой?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        str = scanner.nextLine();
        while (true){
            if (str.equalsIgnoreCase("Да")){
                action = true;
                break;
            } else if (str.equalsIgnoreCase("Нет")){
                System.out.println("Хорошо");
                action = false;
                drink();
                break;
            } else
                System.out.println("Непонял! Повторите пожалуйста");
        }
        if (action == READY_GO_HOME){
            System.out.println("До свидания!");
        }
    }
    public void drinkMore(){
        count++;
        System.out.println("Выпито кружек: " + count);
        System.out.println("Вы похоже, уже пьяны");
        if (count != 5){
            isReadyToGoHome();
        } else
            goToSleepInTheFloor();
    }
    public void goToSleepInTheFloor(){
        System.out.println("Вы уснули на полу");
    }
}
