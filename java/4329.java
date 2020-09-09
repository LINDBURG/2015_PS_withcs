import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        double x = input.nextDouble();
        double y = input.nextDouble();
 
        if(x<5 && x>-5 && y<2.5 && y>-2.5){
            System.out.printf("in");
        }
        else if(((x==5 || x==-5) && y<=2.5 && y>=-2.5) || ((y==2.5 || y ==-2.5) && x<=5 && x>=-5)){
            System.out.printf("on");
        }
        else
            System.out.printf("out");
    }
}