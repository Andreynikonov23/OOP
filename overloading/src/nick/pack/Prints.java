package nick.pack;

public class Prints {

    public void print(int a){
        System.out.println(a);
    }
    public void print(int a, String str){
        System.out.println(a + " " + str);
    }
    public long print(long a, int b){
        return a + b;
    }
    public void print(int a, String str, long b){
        System.out.println(a + " " + str + " " + b);
    }
    public String print (String str){
        return str;
    }
}
