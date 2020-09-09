import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        int arr[][] =new int[num][2];
        for(int i=0;i<num;i++){
            arr[i][0] = input.nextInt();
            arr[i][1] = input.nextInt();
        }
        for(int j=0;j<num;j++) {
            int min = j;
            for (int i = j; i < num; i++) {
                if (arr[i][0] < arr[min][0] && arr[i][0] > 0) {
                    min=i;
                }
                else if (arr[i][0] == arr[min][0] && arr[i][0]>0 && arr[i][1]<arr[min][1]) {
                    min=i;
                }
            }
            int temp[][] = new int[2][2];
            temp[0][0] = arr[min][0];
            temp[0][1] = arr[min][1];
            arr[min][0] = arr[j][0];
            arr[min][1] = arr[j][1];
            arr[j][0] = temp[0][0];
            arr[j][1] = temp[0][1];
        }
        for(int j=0;j<num;j++){
            System.out.printf("%d %d%n", arr[j][0], arr[j][1]);
        }
    }
}