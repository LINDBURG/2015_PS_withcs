import java.math.BigInteger;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            BigInteger num = input.nextBigInteger();
            if(num.equals(BigInteger.valueOf(0))){
                break;
            }
            BigInteger sum ;
            while(true){
                sum = BigInteger.ZERO;
                BigInteger base = BigInteger.ONE;
                for(;num.compareTo(base.multiply(BigInteger.TEN).subtract(BigInteger.ONE))==1;base = base.multiply(BigInteger.TEN)){
 
                }
                for(;!base.equals(BigInteger.ONE);base = base.divide(BigInteger.TEN)){
                    sum = sum.add(num.divide(base));
                    num = num.remainder(base);
                }
                sum = sum.add(num.divide(base));
                if(sum.compareTo(BigInteger.TEN)==-1){
                    break;
                }
                else{
                    num = sum;
                }
            }
            System.out.println(sum);
        }
    }
}