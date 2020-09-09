import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        double num = input.nextDouble();
        int sum =0;
        for(;num>0;num/=10){
            sum+=num%10;
        }
        System.out.println(sum);
    }
}