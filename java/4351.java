import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        for(;num>0;num--){
            int num1 = input.nextInt();
            int arr[] = new int[16];
            int count = 0;
            for(int i=0;Math.pow(2,i)<=Math.abs(num1);i++)
                count=i;
            for(int i = count, num2=Math.abs(num1);i>=0;i--){
                if(num2>=Math.pow(2,i)) {
                    arr[i] = 1;
                    num2 %= Math.pow(2, i);
                }
            }
            if(num1<0){
                for(int i=0;i<16;i++){
                    if(arr[i]==0)
                        arr[i]=1;
                    else
                        arr[i]=0;
                }arr[0]++;
                for(int i=0;i<16;i++){
                    if(arr[i]==2){
                        arr[i]=0;
                        arr[i+1]++;
                    }
                }
            }
            for(int i =15;i>=0;i--){
                System.out.printf("%d",arr[i]);
            }
            if(num!=0){
                System.out.printf("%n");
            }
        }
    }
}