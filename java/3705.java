import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        while(true){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            if(N==0 && M ==0 && K ==0){
                break;
            }
            if(K-M==M-N){
                System.out.printf("AP %d\n",2*K-M);
            }
            else if((double)(K) == (double)(M*M)/(double)(N)){
                System.out.printf("GP %d\n",K*M/N);
            }
        }
    }
}