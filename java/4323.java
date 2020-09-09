import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        double A[] = {input.nextDouble(), input.nextDouble()};
        double B[] = {input.nextDouble(), input.nextDouble()};
        double C[] = {input.nextDouble(), input.nextDouble()};
 
        double side1 = Math.sqrt(Math.pow(A[0]-B[0],2)+Math.pow(A[1]-B[1],2));
        double side2 = Math.sqrt(Math.pow(B[0] - C[0], 2) + Math.pow(B[1] - C[1], 2));
        double side3 = Math.sqrt(Math.pow(A[0]-C[0],2)+Math.pow(A[1]-C[1],2));
        double S = (side1 + side2 + side3)/2;
        double area = Math.sqrt(S*(S - side1)*(S - side3)*(S - side2));
        System.out.printf("%.1f", area-0.05);
    }
}