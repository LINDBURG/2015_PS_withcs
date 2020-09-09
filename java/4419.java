import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int ocnt=0;
        int ecnt=0;
        for(int i=0;i<8;i++){
            int temp = sc.nextInt();
            if(temp%2==1){
                ocnt++;
            }
            else{
                ecnt++;
            }
        }
        if(ocnt<ecnt){
            System.out.printf("EVEN");
        }
        else if(ocnt>ecnt){
            System.out.printf("ODD");
        }
        else{
            System.out.printf("?");
        }
    }
}