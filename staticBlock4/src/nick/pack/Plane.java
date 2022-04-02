package nick.pack;

public class Plane implements Flying{
    private int countPassenger;

    public Plane(int countPassenger){
        this.countPassenger = countPassenger;
    }
    @Override
    public String toString(){
        return "Plane: " + countPassenger;
    }
}
