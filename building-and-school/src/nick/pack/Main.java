package nick.pack;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Заводская 1");
        School school = new School("Заводская 1", "Гимназия №2");
        System.out.println(building.getBuilding());
        System.out.println(school.getSchool());
        Building building1 = new School("Набережная 91", "Гимназия 16");
        System.out.println(building1.getBuilding());
        if (school instanceof Building){
            Object obj = new School("djfkid", "sdjfjd");
            Building building2 = (Building) obj;
            School school1 = (School) building2;
            System.out.println(building2.getBuilding());
            System.out.println(school1.getSchool());
        }
    }
}
