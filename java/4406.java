import javafx.geometry.*;
import java.awt.geom.Line2D;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            x4 = sc.nextDouble();
            y4 = sc.nextDouble();
            x5 = sc.nextDouble();
            y5 = sc.nextDouble();
            x6 = sc.nextDouble();
            y6 = sc.nextDouble();
            x7 = sc.nextDouble();
            y7 = sc.nextDouble();
 
            Triangle2D r1 = new Triangle2D(x1, y1, x2, y2, x3, y3);
            Triangle2D r2 = new Triangle2D(x4, y4, x5, y5, x6, y6);
 
            System.out.printf("Area is %.1f\n", r1.getArea());
            System.out.printf("Perimeter is %.1f\n", r1.getPerimeter());
            System.out.println(r1.contains(x7, y7));
            if (r1.contains(r2)) {
                System.out.println("contain");
            } else if (r1.overlaps(r2)) {
                System.out.println("overlaps");
            } else {
                System.out.println("no overlap");
            }
        }
    }
}
 
class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;
 
    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }
 
    public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
        p1 = new MyPoint(x1, y1);
        p2 = new MyPoint(x2, y2);
        p3 = new MyPoint(x3, y3);
    }
 
    public double getArea() {
        double side1 = p1.distance(p2);
        double side2 = p1.distance(p3);
        double side3 = p2.distance(p3);
 
        double sum = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(sum * ((sum - side1) * (sum - side2) * (sum - side3)));
 
        return area;
    }
 
    public double getArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        MyPoint n1 = new MyPoint(x1, y1);
        MyPoint n2 = new MyPoint(x2, y2);
        MyPoint n3 = new MyPoint(x3, y3);
        double side1 = n1.distance(n2);
        double side2 = n1.distance(n3);
        double side3 = n2.distance(n3);
 
        double sum = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(sum * ((sum - side1) * (sum - side2) * (sum - side3)));
 
        return area;
    }
    public double getPerimeter() {
        double side1 = p1.distance(p2);
        double side2 = p1.distance(p3);
        double side3 = p2.distance(p3);
 
        double perimeter = (side1 + side2 + side3);
 
        return perimeter;
    }
 
    public boolean contains(double x, double y){
        if(getArea() < getArea(p1.getX(),p1.getY(),p2.getX(), p2.getY(),x, y) +
                getArea(p1.getX(),p1.getY(),p3.getX(), p3.getY(),x, y) +
                getArea(p3.getX(),p3.getY(),p2.getX(), p2.getY(),x, y) - 0.001){
            return false;
        }
        else{
            return true;
        }
    }
 
    public boolean contains(Triangle2D r2){
        if(contains(r2.p1.getX(), r2.p1.getY()) &&
                contains(r2.p2.getX(), r2.p2.getY()) &&
                contains(r2.p3.getX(), r2.p3.getY())){
            return true;
        }
        else{
            return false;
        }
    }
 
    public boolean overlaps(Triangle2D r2){
        Line2D line1 = new Line2D.Double(r2.p1.getX(), r2.p1.getY(), r2.p2.getX(), r2.p2.getY());
        Line2D line2 = new Line2D.Double(r2.p1.getX(), r2.p1.getY(), r2.p3.getX(), r2.p3.getY());
        Line2D line3 = new Line2D.Double(r2.p2.getX(), r2.p2.getY(), r2.p3.getX(), r2.p3.getY());
 
        Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
        Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());
 
        return contains(r2) || r2.contains(this) ||
                line1.intersectsLine(side1) ||
                line1.intersectsLine(side2) ||
                line1.intersectsLine(side3) ||
                line2.intersectsLine(side1) ||
                line2.intersectsLine(side2) ||
                line2.intersectsLine(side3) ||
                line3.intersectsLine(side1) ||
                line3.intersectsLine(side2) ||
                line3.intersectsLine(side3);
    }
}
class MyPoint {
    private double x;
    private double y;
 
    public MyPoint(){
        x=0;
        y=0;
    }
 
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
 
    public double getX(){
        return x;
    }
 
    public double getY(){
        return y;
    }
 
    public double distance(MyPoint obj){
        double diffX = obj.getX() - getX();
        diffX *=diffX;
        double diffY = obj.getY() - getY();
        diffY *=diffY;
        double sum = diffX + diffY;
        return Math.sqrt(sum);
 
    }
 
    public double distance(double x,double y){
        double diffX = x - getX();
        diffX *=diffX;
        double diffY = y - getY();
        diffY *=diffY;
        double sum = diffX + diffY;
        return Math.sqrt(sum);
 
    }
 
}