package nick.pack.task2;

import nick.pack.interfaces.Fly;

public class Pegasus extends Horse implements Fly {
    private String wings;


    public Pegasus(String head, int hooves, String body, String tail, String wings){
        super(head, hooves, body, tail);
        this.wings = wings;
    }

    public void fly(){
        System.out.println("Пегас умеет летать");
    }
    public String toString(){
        String str = super.toString() + ", " + wings;
        fly();
        return str;
    }
}
