import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = (y1 - y2)*x1 - (x1 - x2)*y1;
        double f = (y3 - y4)*x3 - (x3 - x4)*y3;
 
        double x = (int)((d*e - b*f)/(a*d - b*c)*10);
        double y = (int)((a*f - e*c)/(a*d - b*c)*10);
 
        if(a * d == b * c){
            System.out.printf("parallel");
        }
        else
            System.out.printf("%.1f %.1f",x/10,y/10);
    }
}