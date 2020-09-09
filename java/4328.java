import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int year = input.nextInt();
        int m = input.nextInt();
        int q = input.nextInt();
        int j = 0;
        int k = 0;
        int h = 0;
        if(m==1){
            m=13;
            year--;
            j = (year / 100);
            k = year % 100;
        }
        else if( m== 2) {
            m = 14;
            year--;
            j = (year / 100);
            k = year % 100;
        }
        else{
            j = (year / 100);
            k = year % 100;
        }
 
        h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
        if(h==0)
            System.out.printf("Saturday");
        else if(h==1)
            System.out.printf("Sunday");
        else if(h==2)
            System.out.printf("Monday");
        else if(h==3)
            System.out.printf("Tuesday");
        else if(h==4)
            System.out.printf("Wednesday");
        else if(h==5)
            System.out.printf("Thursday");
        else
            System.out.printf("Friday");
    }
}