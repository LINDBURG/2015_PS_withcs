import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double i, len, result;
 
        while(true){
            len = sc.nextDouble();
            if(len==0)
                break;
            for(result=2, i=0;i<len;result++){
                i+=(1/result);
            }
            System.out.printf("%d card(s)\n", (int)(result-2));
        }
    }
}