package nick.pack;

public class Main {

    public static void main(String[] args) {
	Chief chief = new Chief();
    Manager manager = new Manager();
    Secretary secretary = new Secretary();

    chief.setData("Иванов С.Е", 59, 110000, 30);
    manager.setData("Краюшкин В.М", 38, 60000, 15, "Юридический");
    secretary.setData("Павлова В.И", 25, 40000, 3, chief);
        System.out.println(chief);
        System.out.println(manager);
        System.out.println(secretary);
    }
}
