import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        for(int i =0;i<num;i++){
            for(int j = 1;j<num-i;j++){
                System.out.printf(" ");
            }
            for(int j = 2*(i+1);j>1;j--){
                System.out.printf("*");
            }
            System.out.printf("%n");
        }
        for(int i = 1;i<num;i++){
            for(int j = 0;j<i;j++){
                System.out.printf(" ");
            }
            for(int j = 1;j<2*(num-i);j++){
                System.out.printf("*");
            }
            if(i<num-1)
                System.out.printf("%n");
        }
    }
}