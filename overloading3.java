package nick.pack;

import java.util.Scanner;

public class Main{
    //1. 1. Считать с консоли данные, пока не введено слово "exit".
    //2. Для каждого значения вызвать метод print. Если значение:
    //2.1. содержит точку '.', то вызвать метод print для Double;
    //2.2. больше нуля, но меньше 128, то вызвать метод print для short;
    //2.3. больше либо равно 128, то вызвать метод print для Integer;
    //2.4. иначе, вызвать метод print для String.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d;
        short s;
        int num;
        char[] chars;
        while (true) {
            String str = scanner.nextLine();
            if (!(str.equalsIgnoreCase("exit"))) {
                chars = str.toCharArray();
                try {
                    boolean isFalse = false;
                    for (int i = 0; i < chars.length; i++) {
                        if (chars[i] == '.') {
                            d = Double.parseDouble(str);
                            print(d);
                            isFalse = true;
                        }
                    }
                    if (isFalse == false) {
                        num = Integer.parseInt(str);
                        if (num < 128 && num > -129) {
                            s = (short) num;
                            num = 0;
                            print(s);
                        } else
                            print(num);
                    }
                } catch (Exception e){
                    print(str);
                }
            } else break;
        }
    }
    public static void print(double d){
        System.out.println(d + " - this double");
    }
    public static void print(short s){
        System.out.println(s + " - this short");
    }
    public static void print(int a){
        System.out.println(a + " - this integer");
    }
    public static void print(String str){
        System.out.println(str + " - this string");
    }
}
