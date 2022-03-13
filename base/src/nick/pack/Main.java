package nick.pack;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User alex = new User(1, "Alex", LocalDate.of(1987, 2, 12), "email.mail", "123");
        User james = new User(2, "James", LocalDate.of(1995, 9, 16), "gmail", "3456");
        ArrayList<User> users = new ArrayList<>();
        users.add(alex);
        users.add(james);
        for (User user : users){
            DBObject object1 = user;
            System.out.println(object1.initializeIdAndName());
        }
    }
}
