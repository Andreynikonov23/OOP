package nick.pack.model;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Computer(Mouse mouse) {
        this.mouse = mouse;
    }

    public Computer(Monitor monitor) {
        this.monitor = monitor;
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public String getKeyboard() {
        return keyboard.getName();
    }

    public String getMouse() {
        return mouse.getName();
    }

    public String getMonitor() {
        return monitor.getName();
    }
}
