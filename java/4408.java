import java.math.BigInteger;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        BigInteger A = sc.nextBigInteger();
        for(;A.remainder(BigInteger.valueOf(100019))!=BigInteger.valueOf(0);A = A.add(BigInteger.valueOf(1))){
 
        }
        System.out.println(A);
    }
}