package nick.pack;

public class SuspensionBridge implements Bridge{
    @Override
    public int getCarsCount() {
        int count = (int)(Math.random() * ((1000 - 10) + 1)-10);
        return count;
    }
}
