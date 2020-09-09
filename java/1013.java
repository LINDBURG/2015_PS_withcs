import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        while(true){
            String[] a = sc.nextLine().split(" ");
            if(a[0].equals("0") && a[1].equals("0")){
                break;
            }
            int cnt=0;
            int max = Math.max(a[0].length(),a[1].length());
            int[][] arr = new int[3][max+1];
 
            for(int i=a[0].length()-1;i>=0;i--){
                arr[0][a[0].length()-i-1] = a[0].charAt(i)-48;
            }
            for(int i=a[1].length()-1;i>=0;i--){
                arr[1][a[1].length()-1-i] = a[1].charAt(i)-48;
            }
            for(int i=0;i<max;i++){
                arr[2][i] += arr[0][i] + arr[1][i];
                if(arr[2][i]>9){
                    cnt++;
                    arr[2][i+1]=1;
                }
            }
            if(cnt==0){
                System.out.println("No carry operation.");
            }
            else if(cnt==1){
                System.out.printf("%d carry operation.\n",cnt);
            }
            else{
                System.out.printf("%d carry operations.\n",cnt);
            }
        }
    }
}