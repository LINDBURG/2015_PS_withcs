import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String re = sc.next();
        int a = Integer.parseInt(re);
        sc.nextLine();
        for(;a>0;a--){
            String line = sc.nextLine();
            int[] arr = new int[(line.length()+1)/2];
            for(int i = 0;i*2<=line.length();i++){
                arr[i] = line.charAt(i*2);
            }
            Arrays.sort(arr);
            for(int i = arr.length-1;i>=0;i--){
                System.out.printf("%c",arr[i]);
            }
            if(a!=1){
                System.out.printf("\n");
            }
        }
    }
}