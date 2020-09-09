import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t, max, min, i, num;
 
        t = sc.nextInt();
        for(i=0;i<t;i++){
            num = sc.nextInt();
            if(num%2==1)
                System.out.printf("0 0\n");
            else{
                max=num/2;
                min=num/4;
                if(num%4==2)
                    min++;
                System.out.printf("%d %d\n", min, max);
            }
        }
    }
}