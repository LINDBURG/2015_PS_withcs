import java.util.Scanner;
public class Main{
 
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int fir[][] = new int [3][3];
        int sec[][] = new int [3][3];
        int res[][] = new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                fir[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sec[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    res[i][j]+=fir[i][k]*sec[k][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(res[i][0]+" "+res[i][1]+" "+res[i][2]);
        }
    }
}