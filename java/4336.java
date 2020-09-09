import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int n = input.nextInt();
        double s = input.nextDouble();
        double a = (int) (100* n * Math.pow(s, 2)/(4 * Math.tan(Math.PI/n)));
 
        System.out.printf("%.2f",a/100);
    }
}