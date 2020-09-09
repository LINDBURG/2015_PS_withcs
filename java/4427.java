import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int base = sc.nextInt();
            int ground = base;
            int sub = 1;
            for(int j=2,cnt=0;base!=1;){
                if(base%j==0){
                    base/=j;
                    cnt++;
                }
                if(base%j!=0 || base==1){
                    if(cnt%2==1){
                        sub*=j;
                    }
                    cnt=0;
                    j++;
                }
            }
            System.out.println(ground*sub +" = " + ground +" x " + sub);
        }
    }
}