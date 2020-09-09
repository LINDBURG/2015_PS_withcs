import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
 
        for(int i=0;i<num;i++){
            double res = 0;
            int j = input.nextInt();
            for( int k =1;k<=j;k++){
                res+=(Math.pow(-1,k+1)/(2*k-1));
            }
            System.out.printf("%.4f%n",4*res-0.00005);
        }
    }
}