import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        BigInteger H, W, i;
 
        while(true){
                H = sc.nextBigInteger();
                W = sc.nextBigInteger();
            if(H.equals(BigInteger.ZERO) && W.equals(BigInteger.ZERO))
                break;
            if(H.compareTo(W.subtract(BigInteger.ONE))==1 && H.remainder(W).equals(BigInteger.ZERO))
                System.out.println(H.divide(W));
            else if(W.compareTo(H.subtract(BigInteger.ONE))==1 && W.remainder(H).equals(BigInteger.ZERO))
                System.out.println(W.divide(H));
            else if(H.compareTo(W)==1){
                for(i = BigInteger.ONE;i.compareTo(W)<=0;i = i.add(BigInteger.ONE)){
                    if((i.multiply(H)).remainder(W).equals(BigInteger.ZERO))
                        break;
                }
                System.out.println(i.multiply(H));
            }
            else{
                for(i = BigInteger.ONE;i.compareTo(H)<=0;i = i.add(BigInteger.ONE)){
                    if((i.multiply(W)).remainder(H).equals(BigInteger.ZERO))
                        break;
                }
                System.out.println(i.multiply(W));
            }
        }
    }
}