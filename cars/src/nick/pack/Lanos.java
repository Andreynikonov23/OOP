package nick.pack;

public class Lanos extends Main.CheapCar {
    @Override
    public String printDesire(){
        return super.printDesire() + ": " + "Я хочу ездить на Ланосе";
    }
}
