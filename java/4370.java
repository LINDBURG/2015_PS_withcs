import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        long mat[][] = new long[num+1][num+1];
        long d[] = new long[num+1];
        d[0] = input.nextInt();
        for(int i=1;i<=num;i++){
            d[i] = input.nextInt();
            if(i!=num)
                input.nextInt();
        }
        for(int j=1;j<=num;j++){
            for(int i=j-1;i>0;i--){
                mat[i][j] = mat[i][i] + mat[i+1][j] + d[i-1]*d[i]*d[j];
                for(int k=i+1;k<=j-1;k++){
                    if(mat[i][j] > mat[i][k] + mat[k+1][j] + d[i-1]*d[k]*d[j]){
                        mat[i][j] = mat[i][k] + mat[k+1][j] + d[i-1]*d[k]*d[j];
                    }
                }
            }
        }
        System.out.println(mat[1][num]);
    }
}