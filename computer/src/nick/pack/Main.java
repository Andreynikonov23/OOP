package nick.pack;

import nick.pack.model.Computer;
import nick.pack.model.Keyboard;
import nick.pack.model.Monitor;
import nick.pack.model.Mouse;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        System.out.println(computer.getKeyboard());
        System.out.println(computer.getMonitor());
        System.out.println(computer.getMouse());
    }
}
