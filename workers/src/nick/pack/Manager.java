package nick.pack;

public class Manager extends Worker{
    private String department;

    public void setData(String name, int age, int salary, int experience, String department){
        setData(name, age, salary, experience);
        this.department = department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public String toString(){
        String str = String.format("Управляющий: Имя - %s, возраст - %d, зарплата - %d, стаж - %d, отдел - %s", getName(), getAge(), getSalary(), getExperience(), department);
        return str;
    }
}
