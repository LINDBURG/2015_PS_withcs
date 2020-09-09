import javafx.geometry.*;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt();
        Point2D p1 = new Point2D(sc.nextDouble(),sc.nextDouble());
        Point2D p2;
        Point2D p3 = new Point2D(sc.nextDouble(),sc.nextDouble());
        double area = 0;
        for(int i=2;i<num;i++){
            p2 = new Point2D(p3.getX(),p3.getY());
            p3 = new Point2D(sc.nextDouble(),sc.nextDouble());
 
            double side1 = p1.distance(p2);
            double side2 = p1.distance(p3);
            double side3 = p2.distance(p3);
 
            double sum = (side1 + side2 + side3) / 2;
            area += Math.sqrt(sum * ((sum - side1) * (sum - side2) * (sum - side3)));
        }
        System.out.printf("The total area is %.2f",area);
    }
}