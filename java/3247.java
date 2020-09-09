import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int a, b, c;
 
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==-1 && b==-1)
                break;
            if((a==0 &&b==1)||(a==1&&b==0))
                System.out.printf("%d+%d=%d\n", a, b, a+b);
            else if(a==0||b==0)
                System.out.printf("%d+%d!=%d\n", a, b, a+b);
            else if(a==1||b==1)
                System.out.printf("%d+%d=%d\n", a, b, a+b);
            else
                System.out.printf("%d+%d!=%d\n", a, b, a+b);
        }
    }
}