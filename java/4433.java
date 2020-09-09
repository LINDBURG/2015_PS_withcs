import java.math.*;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            Rational r1 = new Rational(new BigInteger(sc.next()), new BigInteger(sc.next()));
            Rational r2 = new Rational(new BigInteger(sc.next()), new BigInteger(sc.next()));
 
            System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
            System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
            System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
            System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        }
    }
}
 
class Rational{
    BigInteger x,y,gcd,nx,ny,ngcd;
    Rational(BigInteger a,BigInteger b){
        if(a.multiply(b).compareTo(BigInteger.valueOf(0))>0){
            x = a.abs();
            y = b.abs();
        }
        else{
            x = a.abs().multiply(BigInteger.valueOf(-1));
            y = b.abs();
        }
        gcd = x.abs().gcd(y.abs());
        x = x.divide(gcd);
        y = y.divide(gcd);
    }
    public String add(Rational r2){
        ngcd = y.gcd(r2.y);
        nx = x.multiply(r2.y.divide(ngcd)).add(r2.x.multiply(y.divide(ngcd)));
        ny = y.multiply(r2.y.divide(ngcd));
        ngcd = nx.abs().gcd(ny.abs());
        nx = nx.divide(ngcd);
        ny = ny.divide(ngcd);
        if(nx.remainder(ny)==BigInteger.valueOf(0)){
            return nx.divide(ny).toString();
        }
        else{
            return nx.abs().multiply(nx.divide(nx.abs())).toString() + "/" + ny.abs().toString();
        }
    }
    public String subtract(Rational r2){
        ngcd = y.gcd(r2.y);
        nx = x.multiply(r2.y.divide(ngcd)).subtract(r2.x.multiply(y.divide(ngcd)));
        ny = y.multiply(r2.y.divide(ngcd));
        ngcd = nx.abs().gcd(ny.abs());
        nx = nx.divide(ngcd);
        ny = ny.divide(ngcd);
        if(nx.remainder(ny)==BigInteger.valueOf(0)){
            return nx.divide(ny).toString();
        }
        else{
            return nx.abs().multiply(nx.divide(nx.abs())).toString() + "/" + ny.abs().toString();
        }
    }
    public String multiply(Rational r2){
        nx = x.multiply(r2.x);
        ny = y.multiply(r2.y);
        ngcd = nx.abs().gcd(ny.abs());
        nx = nx.divide(ngcd);
        ny = ny.divide(ngcd);
        if(nx.remainder(ny)==BigInteger.valueOf(0)){
            return nx.divide(ny).toString();
        }
        else{
            return nx.abs().multiply(nx.divide(nx.abs())).toString() + "/" + ny.abs().toString();
        }
    }
    public String divide(Rational r2){
        nx = x.multiply(r2.y).multiply(r2.x.divide(r2.x.abs()));
        ny = y.multiply(r2.x).multiply(r2.x.divide(r2.x.abs()));
        ngcd = nx.abs().gcd(ny.abs());
        nx = nx.divide(ngcd);
        ny = ny.divide(ngcd);
        if(nx.remainder(ny)==BigInteger.valueOf(0)){
            return nx.divide(ny).toString();
        }
        else{
            return nx.abs().multiply(nx.divide(nx.abs())).toString() + "/" + ny.abs().toString();
        }
    }
    public String toString(){
        if(x.remainder(y)==BigInteger.valueOf(0)){
            return x.divide(y).toString();
        }
        else{
            return x.toString() + "/" + y.toString();
        }
    }
}