import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
 
        double x = (d*e - b*f)/(a*d - b*c);
        double y = (a*f - e*c)/(a*d - b*c);
 
        if(a * d == b * c){
            System.out.printf("no solution");
        }
        else if(x>y)
            System.out.printf("%d %d",(int)x,(int)y);
        else
            System.out.printf("%d %d",(int)y,(int)x);
    }
}