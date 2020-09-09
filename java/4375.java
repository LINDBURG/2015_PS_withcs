import java.util.*;
public class Main {
 
    public static int max=1, x ,y ,flag = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int arr[][] = new int[7][6];
        int num[] = new int[42];
        for(int i=0;i<42;i++){
            num[i] = input.nextInt();
        }
        int flag = 0;
        for(int count=0;count<42 && flag ==0;count++){
            int j=0;
            for(;arr[num[count]][j]!=0;j++){
 
            }
            if(count%2==0){
                arr[num[count]][j] = 'R';
            }
            else{
                arr[num[count]][j] = 'Y';
            }
            if(j>=3 && arr[num[count]][j] == arr[num[count]][j-1] && arr[num[count]][j-1] == arr[num[count]][j-2] && arr[num[count]][j-2] == arr[num[count]][j-3]){
                flag =1;
            }
            else if(num[count]<=3){
                for(int k=0;k<=num[count];k++){
                    if(arr[k][j] == arr[k+1][j] && arr[k+1][j] == arr[k+2][j] && arr[k+2][j] ==arr[k+3][j]){
                        flag =1;
                    }
                    else if(num[count]-k+j<6 &&num[count]-k+j>=3 && arr[k][num[count]-k+j] == arr[k+1][num[count]-k+j-1] && arr[k+1][num[count]-k+j-1] == arr[k+2][num[count]-k+j-2] && arr[k+2][num[count]-k+j-2] == arr[k+3][num[count]-k+j-3]){
                        flag =1;
                    }
                    else if(k-num[count]+j>=0 &&k-num[count]+j<=2 && arr[k][k-num[count]+j] == arr[k+1][k-num[count]+j+1] && arr[k+1][k-num[count]+j+1] == arr[k+2][k-num[count]+j+2] && arr[k+2][k-num[count]+j+2] == arr[k+3][k-num[count]+j+3]) {
                        flag =1;
                    }
                }
            }
            else{
                for(int k=num[count]-3;k<=3;k++){
                    if(arr[k][j] == arr[k+1][j] && arr[k+1][j] == arr[k+2][j] && arr[k+2][j] ==arr[k+3][j]){
                        flag =1;
                    }
                    else if(num[count]-k+j<6 &&num[count]-k+j>=3 && arr[k][num[count]-k+j] == arr[k+1][num[count]-k+j-1] && arr[k+1][num[count]-k+j-1] == arr[k+2][num[count]-k+j-2] && arr[k+2][num[count]-k+j-2] == arr[k+3][num[count]-k+j-3]){
                        flag =1;
                    }
                    else if(k-num[count]+j>=0 &&k-num[count]+j<=2 && arr[k][k-num[count]+j] == arr[k+1][k-num[count]+j+1] && arr[k+1][k-num[count]+j+1] == arr[k+2][k-num[count]+j+2] && arr[k+2][k-num[count]+j+2] == arr[k+3][k-num[count]+j+3]) {
                        flag =1;
                    }
                }
            }
        }
        for(int i=5;i>=0;i--){
            for(int j=0;j<7;j++){
                if(arr[j][i]!=0) {
                    System.out.printf("%c", arr[j][i]);
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i>0){
                System.out.printf("%n");
            }
        }
    }
}