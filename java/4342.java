import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        for(;num>0;num--){
            int num1 = input.nextInt();
            for(int i =2;num1 !=1;){
                if(num1 % i ==0){
                    System.out.printf("%d", i);
                    num1 /= i;
                    if(num1 != 1)
                        System.out.printf(" ");
                }
                else{
                    i++;
                }
            }
            if(num>1)
                System.out.printf("%n");
        }
    }
}