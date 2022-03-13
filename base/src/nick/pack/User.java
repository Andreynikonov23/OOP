package nick.pack;

import java.time.LocalDate;
import java.util.ArrayList;

public class User implements DBObject{
    private int id;
    private String name;
    private LocalDate birthday;
    private String email;
    private String password;
    private ArrayList<User> users;
    public User(){
    }
    public User (int id, String name, LocalDate birthday, String email, String password){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.password = password;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public LocalDate getBirthday(){
        return birthday;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    @Override
    public String initializeIdAndName() {
        String str = String.format("User has name %s, id=%d", name, id);
        return str;
    }
}
