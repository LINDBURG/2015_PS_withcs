import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
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
 
            MyRectangle2D r1 = new MyRectangle2D(x1, y1, x2, y2);
            MyRectangle2D r2 = new MyRectangle2D(x3, y3, x4, y4);
 
            System.out.printf("Area is %.1f\n", r1.getArea());
            System.out.printf("Perimeter is %.1f\n", r1.getPerimeter());
            System.out.println(r1.contains(x5, y5));
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
 
class MyRectangle2D{
    double x;
    double y;
    double w;
    double h;
    public MyRectangle2D(double x1, double y1, double w1, double h1){
        x = x1;
        y = y1;
        w = w1;
        h = h1;
    }
    public MyRectangle2D(){
        x = 0;
        y = 0;
        w = 1;
        h = 1;
    }
    public double getArea(){
        return w*h;
    }
    public double getPerimeter(){
        return 2*(w+h);
    }
    public boolean contains(double x5, double y5){
        if(x+w/2>=x5 && x-w/2<=x5 && y+h/2>=y5 && y-h/2<=y5){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean contains(MyRectangle2D r2){
        if(x+w/2>=r2.x+r2.w/2 && x-w/2<=r2.x-r2.w/2 && y+h/2>=r2.y+r2.h/2 && y-h/2<=r2.y-r2.h/2){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean overlaps(MyRectangle2D r2){
        if(x+w/2>=r2.x-r2.w/2 && x-w/2<=r2.x+r2.w/2 && y+h/2>=r2.y-r2.h/2 && y-h/2<=r2.y+r2.h/2){
            return true;
        }
        else{
            return false;
        }
    }
}