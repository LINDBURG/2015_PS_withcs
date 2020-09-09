import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        for(;num>0;num--){
            int num1 = input.nextInt();
            int num2 = 0;
            int temp = input.nextInt();
            if(temp>num1){
                num2 = num1;
                num1 = temp;
            }
            else{
                num2 = temp;
            }
            int i = num2;
            for(;i>0;i--){
                if(num1%i==0 && num2%i==0){
                    break;
                }
            }
            System.out.printf("%d%n", i);
        }
    }
}