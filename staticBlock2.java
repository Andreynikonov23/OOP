package nick.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    //1. В статическом блоке считайте две переменные с консоли А и В с типом int.
    //2. Не забыть про IOException, который надо обработать в блоке catch.
    //3. Закрыть поток ввода методом close().
    private static int a;
    private static int b;
    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e){
            System.out.println("Ошибка");
        }
    }
    public static void main(String[] args){
        System.out.println(a+b);
    }
}
