import java.util.*;
public class Main {
 
    public static int max=1, x ,y ,flag = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int num1 =  input.nextInt();
        int num2 =  input.nextInt();
        int x =  input.nextInt();
        int A[] = new int[num1];
        int B[] = new int[num2];
        for(int i=0;i<num1;i++){
            A[i] = input.nextInt();
        }
        for(int i=0;i<num2;i++){
            B[i] = input.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sub = Math.abs(x-A[0] - B[0]);
        for(int i=num1-1, j=0;i>=0 && j<num2 && sub!=0;){
            if(sub > Math.abs(A[i] + B[j] -x)){
                sub = Math.abs(A[i] + B[j] -x);
            }
            if(A[i] + B[j] <x){
                j++;
            }
            else{
                i--;
            }
        }
        System.out.printf("%d",sub);
    }
}