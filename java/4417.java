import java.util.*;
public class Main {
 
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        if(a.length() > b.length()){
            if(b.length() >c.length()){
                System.out.println(c);
            }
            else{
                System.out.println(b);
            }
        }
        else {
            if (a.length() > c.length()) {
                System.out.println(c);
            }
            else{
                System.out.println(a);
            }
        }
    }
}