import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int i, j, num, count, time;
        int[] arr= new int[999];
 
        while(true){
            time = sc.nextInt();
            if(time==0)
                break;
            for(i=0;time>0;i++){
                arr[i] = sc.nextInt();
                if(i%6==5)
                    time--;
            }
            for(num=1, count=0;num<50;num++){
                for(j=0;j<i-1;j++){
                    if (arr[j] == num){
                        count++;
                        break;
                    }
                }
            }
            if(count==49)
                System.out.printf("Yes\n");
            else
                System.out.printf("No\n");
        }
    }
}