package nick.pack;

public class Main {

    public static void main(String[] args) {
        Prints prints = new Prints();
        prints.print(1);
        System.out.println(prints.print("String"));
        System.out.println(prints.print(124, 123));
        prints.print(23, "str");
        prints.print(1334, "Str1", 2384932);
    }
}
