import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] tall = new int[N];
        for(int i =0;i<N;i++){
            tall[i] = sc.nextInt();
        }
        for(int i =0;i<Q;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int min =tall[A-1],max = tall[A-1];
            for(int j=A-1;j<=B-1;j++){
                if(min>tall[j]){
                    min = tall[j];
                }
                if(max<tall[j]){
                    max = tall[j];
                }
            }
            System.out.println(max-min);
        }
    }
}