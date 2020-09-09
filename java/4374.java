import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int row = input.nextInt();
        int col = input.nextInt();
        int count =0;
        int mat[][] = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[j][i] = input.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j<=col-4 && mat[j][i] == mat[j+1][i] && mat[j+1][i]== mat[j+2][i] && mat[j+2][i]== mat[j+3][i]){
                    count++;
                }
                if(j<=col-4 && i<=row-4 && mat[j][i] == mat[j+1][i+1] && mat[j+1][i+1]== mat[j+2][i+2] && mat[j+2][i+2]== mat[j+3][i+3]){
                    count++;
                }
                if(i<=row-4 && mat[j][i] == mat[j][i+1] && mat[j][i+1] == mat[j][i+2] && mat[j][i+2]== mat[j][i+3]){
                    count++;
                }
                if(j>=3 && i<=row-4 && mat[j][i] == mat[j-1][i+1] && mat[j-1][i+1] == mat[j-2][i+2] && mat[j-2][i+2]== mat[j-3][i+3]){
                    count++;
                }
            }
        }
        System.out.printf("%d", count);
    }
}