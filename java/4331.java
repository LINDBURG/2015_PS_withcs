import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        double x = input.nextDouble();
        double y = input.nextDouble();
 
        if(x<200 && x>0 && y<100-(x/2) && y>0){
            System.out.printf("in");
        }
        else if((x==0 && y<=100 && y>=0) || ((y==0 || y==100-(x/2)) && x<=200 && x>=0)){
            System.out.printf("on");
        }
        else
            System.out.printf("out");
    }
}