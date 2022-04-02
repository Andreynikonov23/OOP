package nick.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
    //1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
    //2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в List lines.
    static List<String> list = new ArrayList<>();
    static {
        StringTokenizer tokenizer = new StringTokenizer(Constant.FILE_NAME, "\\");
        while (tokenizer.hasMoreElements()){
            list.add(tokenizer.nextToken());
        }
    }
    public static void main(String[] args) {
        System.out.println(list);
    }
    public class Constant{
        static final String FILE_NAME = "D:\\Call of Duty Modern Warfare\\Modern Warfare Launcher.exe";
    }
}
