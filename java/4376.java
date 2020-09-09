import java.util.*;
public class Main {
 
    public static int max=1, x ,y ,flag = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int row = input.nextInt();
        int col = input.nextInt();
        int arr[][] = new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i=0;i+max<row;i++){
            for(int j=0;j+max<col;j++){
                int w=1;
                flag=0;
                for(;arr[i][j]==1 && j+w<col && i+w<row&& flag==0;){
                    for(int k=j;k<=j+w;k++){
                        if(arr[i+w][k]==0){
                            flag=1;
                            break;
                        }
                    }
                    for(int k=i;k<=i+w;k++){
                        if(arr[k][j+w]==0){
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0){
                        w++;
                    }
                }
                if(w>max){
                    x=i;
                    y=j;
                    max=w;
                }
            }
        }
        System.out.printf("%d %d %d",x,y,max);
    }
}