package nick.pack;

public class Ferrari extends Main.LuxuryCar {
    @Override
    public String printDesire(){
        return super.printDesire() + ": " + "Я хочу ездить на Феррари";
    }
}
