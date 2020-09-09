import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(Calc.add(a, b));
    }
}
 
class Calc{
    public static int add(int a, int b){
        return a+b;
    }
}