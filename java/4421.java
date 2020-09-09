import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int[] arr = new int[100];
        int i=0;
        String line = sc.nextLine();
        int temp=0;
        for(int j=0;j<line.length();j++){
            if(line.charAt(j)>=48 && line.charAt(j)<58){
                temp = temp*10+line.charAt(j)-48;
            }
            else{
                arr[i++]= temp;
                temp = 0;
            }
        }
        arr[i++] = temp;
        int[] arr2 = new int[i];
        for(int j=0;j<i;j++){
            arr2[j] = arr[j];
        }
        Arrays.sort(arr2);
        for (int j=0;j<i;j++){
            System.out.printf("%d",arr2[j]);
            if(j!=i-1){
                System.out.printf(" ");
            }
        }
    }
}