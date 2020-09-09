import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int n = input.nextInt();
            int f0 = 0; // For fib(0)
            int f1 = 1; // For fib(1)
            for (int j = 1; j <= n; j++) {
                int currentFib = f0 + f1;
                f0 = f1;
                f1 = currentFib;
            }
            System.out.println(f0);
        }
    }
}