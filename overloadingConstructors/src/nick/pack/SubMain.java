package nick.pack;

public class SubMain extends Main{

    public static void main(String[] args) {

    }

    public SubMain(String str) {
        super(str);
        System.out.println(str);
    }
    public SubMain(int i){
        super(i);
        System.out.println(i);
    }
    public SubMain(double d){
        super(d);
        System.out.println(d);
    }
}
