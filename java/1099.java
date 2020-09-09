import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int time, a, b, i;
 
        time = sc.nextInt();
        for(i=0;i<time;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a-b>=0 && b>=0 && (a+b)%2==0 && (a-b)%2==0)
                System.out.printf("%d %d\n", (a+b)/2, (a-b)/2);
            else
                System.out.printf("impossible\n");
        }
    }
}