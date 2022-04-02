package nick.pack;

import java.util.Scanner;

public class Main {
    public static Flying flying;
    static {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        flying = reset(str, 20);

    }
    public static void main(String[] args) {
        System.out.println(flying);
    }
    public static Flying reset(String str, int countPassenger){
        Flying result = null;
        if (str.equalsIgnoreCase("helicopter")){
            result = new Helicopter();
        } else if (str.equalsIgnoreCase("plane")){
            result = new Plane(countPassenger);
        }
        return result;
    }
}
