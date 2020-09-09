import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        GeometricObject[] aObject = new GeometricObject[N];
        for (int i = 0; i < N; i++) {
            String shape = sc.next();
            if (shape.equals("Square")) {
                aObject[i] = new Square(sc.nextDouble());
            } else if (shape.equals("Rectangle")) {
                aObject[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
        }
        for (int i = 0; i < aObject.length; i++) {
            if (aObject[i] instanceof Colorable)
                ((Colorable) aObject[i]).howToColor();
            System.out.println("area: " + aObject[i].getArea());
            System.out.println("perimeter: " + aObject[i].getPerimeter());
        }
    }
}
 
interface Colorable{
    void howToColor();
}
abstract class GeometricObject implements Colorable{
    abstract String getArea();
    abstract String	getPerimeter();
}
class Square extends GeometricObject{
    double w;
    public void howToColor(){
        System.out.println("Square\nhowToColor: xxx");
    }
    Square(double x){
        w=x;
    }
    String getArea(){
        return String.format("%.1f",w*w);
    }
    String getPerimeter(){
        return String.format("%.1f",4*w);
    }
}
class Rectangle extends GeometricObject{
    double w;
    double h;
    Rectangle(double x,double y){
        w=x; h=y;
    }
    public void howToColor(){
        System.out.println("Rectangle\nhowToColor: xxx");
    }
    String getArea(){
        return String.format("%.1f",w*h);
    }
    String getPerimeter(){
        return String.format("%.1f",2*(w+h));
    }
}