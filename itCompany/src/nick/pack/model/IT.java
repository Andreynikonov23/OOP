package nick.pack.model;

public class IT extends Worker {
    private String project;

    public void setProject(String project){
        this.project = project;
    }
    public String getProject(){
        return project;
    }
    public void setData(String name, int age, int salary, String project){
        setName(name);
        setAge(age);
        setSalary(salary);
        setProject(project);
    }
    public String toString(){
        String str = String.format("Имя - %s, возраст - %d, зарплата - %d, проект - %s", getName(), getAge(), getSalary(), project);
        return str;
    }
}
