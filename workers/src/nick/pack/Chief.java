package nick.pack;

public class Chief extends Worker{
    public String toString(){
        String str = String.format("Директор: Имя - %s, возраст - %d, зарплата - %d, стаж - %d", getName(), getAge(), getSalary(), getExperience());
        return str;
    }
}
