import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        double fahr, celsius;
        int lower, upper, step;
 
        lower  = -10;
        upper  = 100;
        step  =  10;
 
        celsius = lower;
        while (celsius <= upper ){
            fahr=(celsius)*9/5+32;
            System.out.printf("%3.0f %6.1f\n", celsius, fahr);
            celsius = celsius + step;
        }
    }
}