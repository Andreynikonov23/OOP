package nick.pack;

public class School extends Building {
    private String name;
    public School(String address, String name){
        super(address);
        this.name = name;
    }
    public String getSchool(){
        String str = super.getBuilding() + " " + name;
        return str;
    }
}
