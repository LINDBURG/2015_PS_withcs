import java.util.*;
public class Main {
 
    public static int max=1, x ,y ,flag = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int num =  input.nextInt();
        int xy[][] = new int[4][2];
        double res[][] = new double[6][2];
        for(int k=0;k<num;k++) {
            for (int i = 0; i < 4; i++) {
                xy[i][0] = input.nextInt();
                xy[i][1] = input.nextInt();
            }
            for(int i=0;i<6;i++){
                res[i][0] = 0;
                res[i][1] = 0;
            }
            for (int i = 0,m=0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    double temp = Math.pow(xy[i][0] - xy[j][0],2) + Math.pow(xy[i][1] - xy[j][1],2);
                    int flag=0;
                    for(int l=0;l<m;l++){
                        if(res[l][0]==temp){
                            res[l][1]++;
                            flag =1 ;
                            break;
                        }
                    }
                    if(flag==0){
                        res[m][0]=temp;
                        res[m++][1]++;
                    }
                }
            }
            if(res[0][1]==4 && res[0][0]*2==res[1][0] || res[1][1]==4 && res[1][0]*2==res[0][0]){
                System.out.println("square");
            }
            else{
                System.out.println("not square");
            }
        }
    }
}