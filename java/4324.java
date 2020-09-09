import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int money = input.nextInt();
        double sum =  0;
        for(int i = 0;i<6;i++){
            sum = (sum + money) * (1.00417);
        }
        System.out.printf("%.1f",sum-0.05);
    }
}