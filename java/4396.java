import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
 
        for(int i=sc.nextInt();i>0;i--){
            Date d = new Date(sc.nextLong());
            String s = d.toString();
            System.out.println(s);
        }
    }
}