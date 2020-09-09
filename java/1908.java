import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, t, count;
 
        int[][] arr = new int[5001][5001];
        for(i=0, j=0, count=0;i<=5000&&j<=5000;count++){
            arr[i][j]=count;
            if(count%4==0){
                i++;
                j++;
            }
            else if(count%4==1){
                i++;
                j--;
            }
            else if(count%4==2){
                i++;
                j++;
            }
            else if(count%4==3){
                i--;
                j++;
            }
        }
        t = sc.nextInt();
        for(;t>0;t--){
            i = sc.nextInt();
            j = sc.nextInt();
            if(i==0&& j==0)
                System.out.printf("0\n");
            else if(arr[i][j]!='\0')
                System.out.printf("%d\n", arr[i][j]);
            else
                System.out.printf("No Number\n");
        }
    }
}