import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        Stock stock = new Stock(sc.nextLine(), sc.nextLine());
        stock.setPreviousClosingPrice(sc.nextDouble());
        stock.setCurrentPrice(sc.nextDouble());
 
        System.out.printf("Prev Price: %.2f\n", stock.getPreviousClosingPrice());
        System.out.printf("Curr Price: %.2f\n", stock.getCurrentPrice());
        System.out.printf("Price Change: %.2f%%\n", stock.getChangePercent() * 100);
    }
}
 
class Stock{
    String id, name;
    double Pprice,Cprice;
    Stock(String a, String b){
        id = a;
        name = b;
    }
    void setPreviousClosingPrice(double a){
        Pprice = a;
    }
    void setCurrentPrice(double a){
        Cprice = a;
    }
    double getPreviousClosingPrice(){
        return Pprice;
    }
    double getCurrentPrice(){
        return Cprice;
    }
    double getChangePercent(){
        return Cprice/Pprice -1;
    }
}