package nick.pack;

public class WaterBridge implements Bridge {
    @Override
    public int getCarsCount() {
        int count = (int)(Math.random() * ((10000 - 10) + 1)-10);
        return count;
    }
}
