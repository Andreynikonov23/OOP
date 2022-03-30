package nick.pack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert");
	    while (true){
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("user") || str.equalsIgnoreCase("looser") || str.equalsIgnoreCase("coder") || str.equalsIgnoreCase("proger")){
                if (str.equalsIgnoreCase("user")){
                    User user = new User();
                    doWork(user);
                }
                if (str.equalsIgnoreCase("looser")){
                    Looser looser = new Looser();
                    doWork(looser);
                }
                if (str.equalsIgnoreCase("coder")){
                    Coder coder = new Coder();
                    doWork(coder);
                }
                if (str.equalsIgnoreCase("proger")){
                    Proger proger = new Proger();
                    doWork(proger);
                }
            } else break;
        }
    }
    public static void doWork(User user){
        user.live();
    }
    public static void doWork(Looser looser){
        looser.doNothing();
    }
    public static void doWork(Coder coder){
        coder.coding();
    }
    public static void doWork(Proger proger){
        proger.enjoy();
    }
}
