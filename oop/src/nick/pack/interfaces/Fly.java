package nick.pack.interfaces;

public interface Fly {
    void fly();
    default void land(){
        System.out.println("А так же приземляться");
    }
}
