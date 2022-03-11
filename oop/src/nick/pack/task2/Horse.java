package nick.pack.task2;

import nick.pack.interfaces.Fly;
import nick.pack.interfaces.Run;

public class Horse {
    private String head;
    private int hooves;
    private String body;
    private String tail;

    public Horse(String head, int hooves, String body, String tail){
        this.head = head;
        this.hooves = hooves;
        this.body = body;
        this.tail = tail;
    }

    public String getHead() {
        return head;
    }

    public int getHooves() {
        return hooves;
    }

    public String getBody() {
        return body;
    }

    public String getTail() {
        return tail;
    }
    public String toString(){
        String str = head + ", " + body + ", " + tail + ", " + "копыта: " + tail;
        return str;
    }
}
