import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        double r = input.nextDouble();
        double s = 2*r*Math.sin(Math.PI/5);
        double a = 5* Math.pow(s, 2)/(4 * Math.tan(Math.PI/5));
 
        System.out.printf("%.2f",a);
    }
}