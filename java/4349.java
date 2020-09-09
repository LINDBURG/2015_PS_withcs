import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int year = input.nextInt();
        int m = input.nextInt();
        int q = 1;
        int j = 0;
        int k = 0;
        int h = 0;
        int day =31;
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
 
        h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j -1) % 7;
        System.out.printf("Sun Mon Tue Wed Thu Fri Sat%n");
        for(int i =h;i>0;i--){
            System.out.print("    ");
        }
        if(m==14){
            day=28;
        }
        else if((m<=7 && m%2==0 || m>=8 && m%2==1)&&m!=13){
            day = 30;
        }
        for(int i=1;i<=day;i++){
            if(i<10){
                System.out.printf(" %d",i);
                if((i+h)%7!=0 && i!=day){
                    System.out.printf("  ");
                }
            }
            else{
                System.out.printf("%d",i);
                if((i+h)%7!=0 && i!=day){
                    System.out.printf("  ");
                }
            }
            if((i+h)%7==0 && i!=day){
                System.out.printf("%n");
            }
        }
    }
}