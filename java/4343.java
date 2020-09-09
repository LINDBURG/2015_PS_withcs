import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        for(int i =1;num>0;num-- ,i++){
            for(int j = 1;j<num;j++){
                System.out.printf(" ");
            }
            for(int j = 2*i;j>1;j--){
                System.out.printf("*");
            }
            if(num>1){
                System.out.printf("%n");
            }
        }
    }
}