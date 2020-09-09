import java.util.Scanner;
public class Main{
    public static int count, num=0;
 
    public static void queens(int i, int n,int col[]){
        if(promising(i,col)){
            if(i==n){
                count++;
            }
            else{
                for(int j=1;j<=n;j++){
                    col[i+1] = j;
                    queens(i+1,n,col);
                }
            }
        }
    }
 
    public static boolean promising(int j, int col[]){
        boolean flag = true;
        for(int k=1;k<j && flag;k++){
            if(col[j]==col[k] || Math.abs(col[j]-col[k])==j-k){
                flag = false;
            }
        }
        return flag;
    }
 
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        num=input.nextInt();
        int col[]=new int[num+1];
        queens(0,num,col);
 
        System.out.printf("%d",count);
    }
}