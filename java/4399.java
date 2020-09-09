import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        Account account = new Account(sc.nextInt(), sc.nextInt());
        Account.setAnnualInterestRate(sc.nextDouble());
 
        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());
 
        account.withdraw(sc.nextDouble());
 
        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());
 
        account.deposit(sc.nextDouble());
 
        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());
    }
}
 
class Account{
    int id;
    double balance;
    long dateCreated;
    static double annualInterestRate;
    public Account(int a, int b){
        id = a;
        balance = b;
        Date dateCreated = new Date();
    }
    public Account(){
        id=0;
        balance = 0;
        Date dateCreated = new Date();
    }
    public static void setAnnualInterestRate(double ir){
        annualInterestRate = ir;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double a){
        if(a <= this.balance)
            balance -= a;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/100;
    }
    public double getMonthlyInterest(){
        return balance * annualInterestRate/1200;
    }
    public void deposit(double a){
        this.balance += a;
    }
    public long getDatecreated(){
        return dateCreated;
    }
}