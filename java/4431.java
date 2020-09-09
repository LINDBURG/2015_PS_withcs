import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        GeometricObject1[] aCircle1 = new Circle1[N];
        for (int i = 0; i < N; i++) {
            aCircle1[i] = new Circle1(sc.nextDouble(), sc.next(), sc.nextDouble());
        }
        Arrays.sort(aCircle1);
        for (GeometricObject1 c1 : aCircle1) {
            System.out.println(c1);
        }
    }
}
 
abstract class GeometricObject1 implements Comparable{
    double weight;
    String Color;
}
class Circle1 extends GeometricObject1{
    public double radius;
    Circle1(double x,String y,double z){
        this.radius=x; super.weight=z;
        super.Color=y;
    }
    public int compareTo(Object o){
        Circle1 c= (Circle1)o;
        if(this.radius>c.radius){
            return 1;
        }
        else if(this.radius==c.radius){
            return 0;
        }
        else {
            return -1;
        }
    }
    public String toString(){
        return String.format("radius:%.1f, color:%s, weight:%.1f",radius,Color,weight);
    }
}