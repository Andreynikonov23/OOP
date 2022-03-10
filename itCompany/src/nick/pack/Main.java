package nick.pack;

import nick.pack.model.*;

public class Main {

    public static void main(String[] args) {
        CTO cto = new CTO("Иванов И.И", 42, 240000, "JavaProgram");
        ProjectManager manager = new ProjectManager("Зуев А.С", 31, 170000, "JavaProgram");
        Programmer programmer = new Programmer("Никонов А.С", 20, 10000000, "JavaProgram", "Java");
        Cleaner cleaner = new Cleaner("Миронов Р.И", 20, 100);
        HR hr = new HR("Стожков Д.А", 20, 1000);
        OfficeManager officeManager = new OfficeManager("Иванова Е.И", 124, 100000000);
        System.out.println("Директор: " + cto);
        System.out.println("Менеджер проекта: " + manager);
        System.out.println("Программист: " + programmer);
        System.out.println("Рекрутер: " + hr);
        System.out.println("Офис-Менеджер: " + officeManager);
        System.out.println("Уборщик: " + cleaner);
    }
}
