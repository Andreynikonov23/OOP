package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(fight(Elf.class, EvilMaster.class));
    }

    public static boolean fight(Class first, Class second){
        if(!first.isAnnotationPresent(Person.class))
            throw new RuntimeException("is not game person");
        if(!second.isAnnotationPresent(Person.class))
            throw new RuntimeException("is not game person");

        Person firstPers = (Person) first.getAnnotation(Person.class);
        Person secondPers = (Person) second.getAnnotation(Person.class);

        int firstAttack = firstPers.attack() * firstPers.strength() + firstPers.magic();
        int firstPower = firstPers.live() * firstPers.defense() + firstAttack;

        int secondAttack = secondPers.attack()*secondPers.strength()+ secondPers.magic();
        int secondPower = secondPers.live()*secondPers.defense()+secondAttack;

        return firstPower > secondPower;
    }
}