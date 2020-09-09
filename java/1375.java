import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int line = sc.nextInt();
        int[][] arr = new int[line][line];
        for(int i=0;i<line;i++){
            for(int j=0;j<i+1;j++){
                if(i==0 && j==0){
                    arr[i][j] = sc.nextInt();
                }
                else if(j==0){
                    arr[i][j] = arr[i-1][j]+sc.nextInt();
                }
                else if(j==i){
                    arr[i][j] = arr[i-1][j-1] + sc.nextInt();
                }
                else{
                    if(arr[i-1][j-1]<arr[i-1][j]){
                        arr[i][j] = arr[i-1][j] + sc.nextInt();
                    }
                    else{
                        arr[i][j] = arr[i-1][j-1] + sc.nextInt();
                    }
                }
            }
        }
        int max=arr[line-1][0];
        for(int i=0;i<line;i++){
            if(arr[line-1][i]>max){
                max = arr[line-1][i];
            }
        }
        System.out.println(max);
    }
}