import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.printf("%.1f%n%.1f", num1 * num1 * 3.14159-0.05, num2*num1*num1*3.14159-0.05 );
    }
}