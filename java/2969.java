import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int time = sc.nextInt();
        for(int i=1;i<=time;i++){
            int num = sc.nextInt();
            int sum =0,T=3;
            for(int k=1;k<=num;T +=(k+2),k++){
                sum += k*T;
            }
            System.out.printf("%d %d %d\n",i,num,sum);
        }
    }
}