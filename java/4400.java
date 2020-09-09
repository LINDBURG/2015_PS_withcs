import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        Fan1 fan1 = new Fan1();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            String val = sc.next();
            if (op.compareTo("speed") == 0) {
                if (val.compareTo("SLOW") == 0) fan1.setSpeed(Fan1.SLOW);
                else if (val.compareTo("FAST") == 0) fan1.setSpeed(Fan1.FAST);
                else fan1.setSpeed(Fan1.MEDIUM);
            } else if (op.compareTo("radius") == 0) {
                fan1.setRadius(Double.parseDouble(val));
            } else if (op.compareTo("color") == 0) {
                fan1.setColor(val);
            } else if (op.compareTo("on") == 0) {
                if (val.compareTo("true") == 0) fan1.setOn(true);
                else fan1.setOn(false);
            }
        }
        System.out.println(fan1.toString());
    }
}
 
class Fan1{
    static int SLOW;
    static int MEDIUM;
    static int FAST;
    int speed;
    boolean on;
    double radius;
    String color;
    Fan1(){
        SLOW = 1;
        MEDIUM = 2;
        FAST = 3;
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    public void setSpeed(int a){
        if (a==1){
            this.speed = SLOW;
        }
        else if (a==2){
            this.speed = MEDIUM;
        }
        else {
            this.speed = FAST;
        }
    }
    public void setOn(boolean a){
        on = a;
    }
    public void setRadius(double a){
        radius = a;
    }
    public void setColor(String a){
        color = a;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        String s= "";
        if(on){
            s+= String.format("speed " + speed + "\ncolor " + color + "\nradius " + "%.2f",radius );
    }
        else{
            s+= String.format("color " + color + "\nradius " + "%.2f" + "\nfan is off",radius);
        }
        return s;
    }
}