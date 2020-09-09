import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int i, j, num, temp, count;
 
        for(count=1;;count++){
            num = sc.nextInt();
            if(num==0)
                break;
            System.out.printf("%d. ", count);
            temp=3*num;
            if(temp%2==1){
                System.out.printf("odd ");
                temp=(3*(temp+1)/2)/9;
                System.out.printf("%d\n", temp);
            }
            else{
                System.out.printf("even ");
                temp=(3*(temp/2))/9;
                System.out.printf("%d\n", temp);
            }
        }
    }
}