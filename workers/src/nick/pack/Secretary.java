package nick.pack;

public class Secretary extends Worker{
    private Chief chief;

    public void setData(String name, int age, int salary, int experience, Chief chief){
        setData(name, age, salary, experience);
        this.chief = chief;
    }
    public void setChief(Chief chief){
        this.chief = chief;
    }
    public Chief getChief(){
        return chief;
    }
    public String toString(){
        String str = String.format("Секретарь: Имя - %s, возраст - %d, зарплата - %d, стаж - %d, директор - %s", getName(), getAge(), getSalary(), getExperience(), chief.getName());
        return str;
    }
}
