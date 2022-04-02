package nick.pack;

public class Main {
    public  String str;
    public int i;
    public double d;
    public static void main(String[] args) {
        SubMain subMain = new SubMain(5.6);
    }
    public Main(String str){
        this.str = str;
    }
    public Main(int i){
        this.i = i;
    }
    public Main(double d){
        this.d = d;
    }
}
