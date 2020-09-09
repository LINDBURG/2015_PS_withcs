import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        if(a ==60&&  b== 60&& c==60){
            System.out.printf("Equilateral triangle");
        }
        else if(a==b|| b==c||c==a){
            System.out.printf("Isosceles triangle");
        }
        else{
            System.out.printf("Triangle");
        }
    }
}