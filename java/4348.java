import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
 
        for(int i=0;i<num;i++){
            double res = 0;
            int j = input.nextInt();
            for( int k =1;k<=j;k++){
                double r =k;
                for(int l =1;l<k;l++){
                    r*=l;
                }
                res+=1/r;
            }
            System.out.printf("%.6f%n",1+res-0.0000005);
        }
    }
}