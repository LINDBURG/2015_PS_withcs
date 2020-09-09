import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, result=0;
        String[] arr = new String[2];
 
        arr[0] = sc.next();
        arr[1] = sc.next();
        for(i=0;i<arr[0].length();i++){
            for(j = 0;j<arr[1].length();j++){
                result+= (arr[0].charAt(i)-48)*(arr[1].charAt(j)-48);
            }
        }
        System.out.printf("%d", result);
    }
}