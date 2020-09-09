import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        int a[][] = new int[500][2];
        int i=0;
        for(;num>0;num--,i++){
            int temp = input.nextInt();
            int flag =0;
            for(int j=0;j<i;j++){
                if(a[j][0]==temp){
                    flag =1 ;
                    a[j][1]++;
                    i--;
                    break;
                }
            }
            if(flag==0){
                a[i][0]=temp;
                a[i][1]=1;
            }
        }
        for(int j=0;j<i;j++){
            int min =0;
            for(int k=1;k<i;k++){
                if(a[min][0]>a[k][0]){
                    min=k;
                }
            }
            System.out.printf("%d %d",a[min][0],a[min][1]);
            a[min][0]=101;
            if(j<i-1){
                System.out.printf("%n");
            }
        }
    }
}