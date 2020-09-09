import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
 
        for(int i=1;i<=num;i++){
            for(int j=i;j<num;j++){
                System.out.printf("    ");
            }
            for(int j=1, k=1;j<i*2;j++){
                if(j<i){
                    System.out.printf("%4d",k);
                    k*=2;
                }
                else{
                    System.out.printf("%4d",k);
                    k/=2;
                }
            }
            if(i<num){
                System.out.printf("%n");
            }
        }
    }
}