package nick.pack.interfaces;

public interface Fly {
    void fly();
    default void landing(){
        System.out.println("А так же приземляться");
    }
}
