package nick.pack;

import nick.pack.model.Earth;
import nick.pack.model.Moon;
import nick.pack.model.Sun;

import java.util.Scanner;

public class Main implements Planet {
    //1. Найти в гугле пример для - Singleton pattern Lazy initialization.
    //2. По образу и подобию в отдельных файлах создать три синглтон класса Sun, Moon, Earth.
    //3. Реализовать интерфейс Planet для классов Sun, Moon, Earth.
    //4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet.
    //5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
    //5.1. С консоли считать один параметр типа String.
    //5.2. Если параметр равен одной из констант интерфейса Planet,
           //то создать соответствующий объект и присвоить его Planet thePlanet, иначе обнулить Planet thePlanet.
    //5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки.
    public static Planet thePlanet;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        thePlanet = readKeyFromConsoleAndInitPlanet(str, thePlanet);
        System.out.println(thePlanet);
    }


    public static Planet readKeyFromConsoleAndInitPlanet(String key, Planet thePlanet) {
        if (key.equals(Planet.EARTH)){
            thePlanet = Earth.getInstance();
        } else if (key.equals(Planet.MOON)){
            thePlanet = Moon.getInstance();
        } else if (key.equals(Planet.SUN)){
            thePlanet = Sun.getInstance();
        }
        return thePlanet;
    }
}
