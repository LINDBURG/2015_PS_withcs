import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int N , M , i , j, k=0, count;
        int[] a = new int[1000000];
        int[] b = new int[1000000];
        while(sc.hasNext()){
            N = sc.nextInt();
            M = sc.nextInt();
            if(N==0&& M==0)
                break;
            for (i=0;i <N;i++){
                a[i] = sc.nextInt();
            }
            for (i=0;i <M;i++){
                b[i] = sc.nextInt();
            }
            for (i=0, j=0, count=0;i <N&& j<M;){
                if (a[i] == b[j]){
                    count++;
                    i++;
                    j++;
                }
                else if(a[i]>b[j])
                    j++;
                else if(a[i]<b[j])
                    i++;
            }
            System.out.printf ("%d\n", count);
        }
    }
}