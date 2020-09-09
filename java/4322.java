import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        double  weight= input.nextDouble()*0.45359237;
        double height = input.nextDouble()*0.0254;
        System.out.printf("%.2f", weight/(Math.pow(height,2))-0.005);
    }
}