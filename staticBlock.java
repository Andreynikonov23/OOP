package nick.pack;

import java.util.HashMap;
import java.util.Map;

public class Main{
    //В статическом блоке инициализировать labels 5 различными парами ключ-значение.
    private static Map<Integer, String> labels = new HashMap<>();
    static {
        labels.put(1, "A");
        labels.put(2, "B");
        labels.put(3, "C");
        labels.put(4, "D");
        labels.put(5, "E");
    }
    public static void main(String[] args){
        System.out.println(labels);
    }
}
