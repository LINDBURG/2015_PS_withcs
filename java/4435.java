import java.math.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        for(int i=0; i<T; i++){
            String numberString = input.nextLine();
            BigInteger bigNumber = new BigInteger(numberString);
            System.out.println(factorial(bigNumber));
        }
	}
 
	    public static BigInteger factorial(BigInteger num){
        BigInteger re = num;
        while(num.compareTo(new BigInteger("1"))==1){
            num=num.subtract(BigInteger.valueOf(1));
            re=re.multiply(num);
        }
        return re;
    }
}