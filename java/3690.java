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
            int sum =N;
            int[] pat = new int[K];
            for(int i=0;i<K;i++){
                pat[i] = sc.nextInt();
            }
            int n =0;
            for(int i=0;i<M-1;i++){
                n = i%K;
                N +=pat[n];
                sum+= N;
            }
            System.out.println(sum);
        }
    }
}