import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        if(num>0){
            String fir1 = input.next();
            String sec1 = "asdf";
            int fir2 = input.nextInt();
            int sec2 =0;
            for(int i = 1;i<num; i++){
                String temp1 = input.next();
                int temp2 = input.nextInt();
                if(fir2 < temp2){
                    sec1 = fir1;
                    sec2 = fir2;
                    fir1 = temp1;
                    fir2 = temp2;
                }
                else if(sec2 < temp2){
                    sec1 = temp1;
                    sec2 = temp2;
                }
            }
            System.out.printf("%s %d%n%s %d",fir1, fir2, sec1, sec2);
        }
    }
}