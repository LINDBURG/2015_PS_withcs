import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = Math.pow(b ,2) - 4 * a * c;
        double r = 0;
        if( d < 0){
            System.out.printf("complex");
        }
        else if (d == 0){
            r = -(b/(2*a));
        }
        else {
            r = (-b + Math.sqrt(d))/(2*a);
            if (r < (-b - Math.sqrt(d))/(2*a)){
                r = (-b - Math.sqrt(d))/(2*a);
            }
        }
        System.out.printf("%.1f",r-0.05);
    }
}