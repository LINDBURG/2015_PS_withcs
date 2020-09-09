import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        while(true){
            String A = sc.nextLine();
            String B = sc.nextLine();
            if(A.charAt(0)=='E' && B.charAt(0)=='E'){
                break;
            }
            int acnt=0,bcnt=0;
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)==B.charAt(i)){
 
                }
                else if(A.charAt(i)=='R' && B.charAt(i)=='S' || A.charAt(i)=='S' && B.charAt(i)=='P' ||A.charAt(i)=='P' && B.charAt(i)=='R'){
                    acnt++;
                }
                else{
                    bcnt++;
                }
            }
            System.out.printf("P1: %d\nP2: %d\n",acnt,bcnt);
        }
    }
}