import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        double[][] points = new double[N][2];
        for (int i = 0; i < N; i++) {
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
        }
        MyRectangle2D boundingRectangle = MyRectangle2D.getRectangle(points);
        System.out.printf("x, y: %.1f, %.1f\n", boundingRectangle.getX(), boundingRectangle.getY());
        System.out.printf("w, h: %.1f, %.1f\n", boundingRectangle.getWidth(), boundingRectangle.getHeight());
    }
}
 
class MyRectangle2D{
    double maxX;
    double minX;
    double maxY;
    double minY;
    public static MyRectangle2D getRectangle(double[][] points){
        MyRectangle2D n=new MyRectangle2D();
        n.maxX=n.minX=points[0][0];
        n.maxY=n.minY=points[0][1];
        for(int i=1;i<points.length;i++){
            n.maxX=Math.max(points[i][0], n.maxX);
            n.maxY=Math.max(points[i][1], n.maxY);
            n.minX=Math.min(points[i][0], n.minX);
            n.minY=Math.min(points[i][1], n.minY);
        }
        return n;
    }
    double getX(){
        return (maxX+minX)/2;
    }
    double getY(){
        return (maxY+minY)/2;
    }
    double getWidth(){
        return maxX-minX;
    }
    double getHeight(){
        return maxY-minY;
    }
}