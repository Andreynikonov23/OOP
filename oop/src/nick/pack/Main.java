package nick.pack;

import nick.pack.interfaces.Climb;
import nick.pack.interfaces.Fly;
import nick.pack.interfaces.Run;
import nick.pack.task1.*;
import nick.pack.task2.Horse;
import nick.pack.task2.Pegasus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Tiger());
        list.add(new Leon());
        list.add(new Bull());
        list.add(new Cow());
        list.add(new Duck());
        list.add(new Penguin());
        task1(list);
        task2(list);
        task3();
    }
    public static void task1(ArrayList<Object> list){
        System.out.println(1);
        System.out.println("Check1-----------------");
        check(list);
        System.out.println();
        System.out.println("Check2-----------------");
        check2(list);
        System.out.println();
    }
    public static void task2(ArrayList<Object> list){
        System.out.println(2);
        System.out.println("Fly--------------------------");
        whoIsFly(list);
        System.out.println("Climb--------------------------");
        whoIsClimb(list);
        System.out.println("Run--------------------------");
        whoIsRun(list);
    }
    public static void task3(){
        System.out.println();
        System.out.println();
        System.out.println(3);
        Horse horse = new Horse("голова", 4, "тело", "хвост");
        Pegasus pegasus = new Pegasus("голова", 4, "тело", "хвост", "крылья");
        System.out.println(horse);
        System.out.println(pegasus);
    }
    public static void check(ArrayList<Object> list){
        for (Object obj : list) {
            if (obj instanceof Cat) {
                System.out.print("Кот, ");
            } else if (obj instanceof Leon) {
                System.out.print("Лев, ");
            } else if (obj instanceof Tiger) {
                System.out.print("Тигр, ");
            } else if (obj instanceof Bull) {
                System.out.print("Бык, ");
            } else {
                System.out.print("хз, ");
            }
        }
    }
    public static void check2(ArrayList<Object> list){
        for (Object obj : list) {
            if (obj instanceof Cat) {
                System.out.print("Кот, ");
            } else if (obj instanceof Leon) {
                System.out.print("Лев, ");
            } else if (obj instanceof Tiger) {
                System.out.print("Тигр, ");
            } else if (obj instanceof Bull) {
                System.out.print("Бык, ");
            } else if (obj instanceof Cow){
                System.out.print("Корова, ");
            } else {
                System.out.print("Животное, ");
            }
        }
    }
    public static void whoIsFly(ArrayList<Object> list){
        for (Object obj : list){
            if (obj instanceof Fly){
                Fly fly = (Fly) obj;
                fly.fly();
            }
        }
    }
    public static void whoIsRun(ArrayList<Object> list){
        for (Object obj : list){
            if (obj instanceof Run){
                Run run = (Run) obj;
                run.run();
            }
        }
    }
    public static void whoIsClimb(ArrayList<Object> list){
        for (Object obj : list){
            if (obj instanceof Climb){
                Climb climb = (Climb) obj;
                climb.climb();
            }
        }
    }
}
