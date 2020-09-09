import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        double num = input.nextDouble()*3.28084;
        double num1 = Math.floor(num);
        System.out.printf("%.0f%n%.0f",num1,(num-num1)*12-0.5);
    }
}