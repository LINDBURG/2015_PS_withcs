import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        while (sc.hasNext()){
            int n =1;
            int cnt =1;
            int c = -1;
            c= sc.nextInt();
            if(n ==-1){
                break;
            }
            for(;n%c!=0;n=(n%c)*10+1){
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}