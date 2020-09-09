import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int c, i, t, l=0,state=0;
        char[][] arr = new char[2][200];
 
        arr[0] = sc.nextLine().toCharArray();
        arr[1] = sc.nextLine().toCharArray();
        for (i=0;i<arr[0].length;++i){
            for (t=0;t<arr[1].length;++t){
                if(arr[0][i]==arr[1][t]){
                    l=i;
                    state=1;
                    break;
                }
            }
            if(state==1)
                break;
        }
        if(state==1)
            System.out.printf("%d", l);
        else{
            System.out.printf("-1");
        }
    }
}