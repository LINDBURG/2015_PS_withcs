import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n= sc.nextInt();
            if(n==0){
                break;
            }
            int dis[] = new int[n];
            for(int i=0;i<n;i++){
                dis[i] = sc.nextInt();
            }
            Arrays.sort(dis);
            int i=1;
            int flag =1;
            for(;i<n;i++){
                if(dis[i]-dis[i-1]>200){
                    flag =0;
                    break;
                }
            }
            if(flag ==1 && 1522-dis[i-1]<=200 && dis[0]<=200){
                System.out.println("POSSIBLE");
            }
            else{
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}