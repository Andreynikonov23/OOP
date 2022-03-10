package nick.pack.model;

import nick.pack.interfaces.Fly;

public class Airplane implements Fly {
    public void fly(){
        System.out.println("Самолет умеет летать");
    }
}
