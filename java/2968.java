import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=0;i<num;i++){
            int money = input.nextInt();
            int quar = money/25;
            money = money%25;
            int dime = money/10;
            money = money%10;
            int nic = money/5;
            money = money%5;
            String s = String.format("%d %d QUARTER(S), %d DIME(S), %d NICKEL(S), %d PENNY(S)",i+1, quar, dime, nic, money);
            System.out.println(s);
        }
    }
}