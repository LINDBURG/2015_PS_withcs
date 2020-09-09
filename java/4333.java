import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        double p0[] = {input.nextDouble(),input.nextDouble()};
        double p1[] = {input.nextDouble(),input.nextDouble()};
        double p2[] = {input.nextDouble(),input.nextDouble()};
        double m = (p1[0] - p0[0])*(p2[1] - p0[1]) - (p2[0] - p0[0])*(p1[1] - p0[1]);
 
        if(m>0)
            System.out.printf("left");
        else if (m<0)
            System.out.printf("right");
        else
            System.out.printf("on the line");
 
    }
}