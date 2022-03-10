package nick.pack;

public class Main{
    public static void main(String[] args) {
        System.out.println(max(12, 34));
        System.out.println(max(111223, 232731));
        System.out.println(max(213.8, 123.6));
        System.out.println(min(12, 34));
        System.out.println(min(217328222,2132111233));
        System.out.println(min(213.8, 123.6));
    }
    public static int max(int a, int b){
        if (a > b){
            return a;
        } else
            return b;
    }
    public static long max(long a, long b){
        if (a > b){
            return a;
        } else
            return b;
    }
    public static double max(double a, double b){
        if (a > b){
            return a;
        } else
            return b;
    }
    public static int min(int a, int b){
        if (a < b){
            return a;
        } else
            return b;
    }
    public static long min(long a, long b){
        if (a < b){
            return a;
        } else
            return b;
    }
    public static double min(double a, double b){
        if (a < b){
            return a;
        } else
            return b;
    }
}
