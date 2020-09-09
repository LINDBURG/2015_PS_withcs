import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        int a[][] = new int[1000][2];
        int i=0;
        for(;num>0;num--,i++){
            int temp = input.nextInt();
            int flag =0;
            for(int j=0;j<i;j++){
                if(a[j][0]==temp){
                    flag =1 ;
                    a[j][1]++;
                    break;
                }
            }
            if(flag==0){
                a[i][0]=temp;
                a[i][1]=1;
            }
        }
        int max =0;
        for(int j=0;j<i;j++){
            if(a[j][1]>a[max][1]){
                max=j;
            }
        }
        System.out.printf("%d%n%d",a[max][0],a[max][1]);
    }
}