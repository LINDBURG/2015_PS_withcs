import java.util.*;
public class Main {
    public static int cnt;
    public static int[][] arr;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int time = sc.nextInt();
        for(int i=0; i<time;i++){
            cnt =0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            arr = new int[n+1][n+1];
            for(int j=0;j<m;j++){
                int temp = sc.nextInt();
                for(int k=0;true;k++){
                    if(arr[temp][k]==0){
                        arr[temp][k] = sc.nextInt();
                        break;
                    }
                }
            }
            for(int j=0;j<l;j++){
                fall(sc.nextInt());
            }
            System.out.println(cnt);
        }
    }
    public static void fall(int target){
        cnt++;
        for(int i=0;arr[target][i]!=0;i++){
            fall(arr[target][i]);
        }
    }
}