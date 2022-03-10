package nick.pack.model;

public class Programmer extends IT {
    private String programLanguage;

    public Programmer(String name, int age, int salary, String project, String programLanguage){
        setData(name, age, salary, project);
        this.programLanguage = programLanguage;
    }
    public String toString(){
        String str = String.format("Имя - %s, возраст - %d, зарплата - %d, проект - %s, язык программирования - %s", getName(), getAge(), getSalary(), getProject(), programLanguage);
        return str;
    }
}
