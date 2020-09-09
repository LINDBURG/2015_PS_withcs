import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        int sum= 0;
 
        if(sum==0) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                sum += (9 - i) * (int)(((num % Math.pow(10, i+1))/Math.pow(10,i)));
                if(num/Math.pow(10, i) <1){
                    System.out.printf("%d", 0);
                }
            }
            if(num!=0)
                System.out.printf("%d", num);
            if (sum % 11 == 10) {
                System.out.printf("X");
            }
            else
                System.out.printf("%d", sum % 11);
        }
    }
}
