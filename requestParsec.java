package nick.pack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    /*
    Считать с консоли URl ссылку.
    Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
    URL содержит минимум 1 параметр.
    Если присутствует параметр obj, то передать его значение в нужный метод alert.
        alert(double value) - для чисел (дробные числа разделяются точкой)
        alert(String value) - для строк
     */
    static String uri;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        uri = scanner.nextLine();
        if (uri.contains("obj")){
            StringBuilder builder = new StringBuilder(uri);
            int start = builder.indexOf("obj") + 4;
            int ampersant = builder.indexOf("&", start);
            double value = Double.parseDouble(uri.substring(start, ampersant));
            alert(value);
        } else {
            alert(uri);
        }
    }
    public static void alert(double value){
        alert(uri);
        System.out.println();
        System.out.println("double: " + value);
    }
    public static void alert(String value){
        StringBuilder builder = new StringBuilder(value);
        int index = builder.indexOf("?") + 1;
        String temp = builder.substring(index, value.length());
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(temp, "&");
        while (tokenizer.hasMoreElements()){
            list.add(tokenizer.nextToken());
        }
        for (int i=0; i < list.size(); i++) {
            if (list.get(i).contains("=")) {
                StringBuilder newBuilder = new StringBuilder(list.get(i));
                int start = newBuilder.indexOf("=");
                newBuilder.delete(start, list.get(i).length());
                list.set(i, String.valueOf(newBuilder));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
    }
}
