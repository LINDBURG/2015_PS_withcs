import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        Account bank[]=new Account[10];
        for(int i=0;i<10;i++)
            bank[i]=new Account(i,100);
        while(true){
            System.out.printf("Enter an id: ");
            int id = sc.nextInt();
            if(Math.abs(id)>100){
                System.out.printf("Exit code entered");
                break;
            }
            for(;id<0 || id>9;id = sc.nextInt()){
                System.out.printf("Please enter a correct id\nEnter an id: ");
            }
            int choice =0;
            for(int flag =1;;){
                if(flag == 1){
                    System.out.printf("\nMain menu\n" +
                        "1: check balance\n" +
                        "2: withdraw\n" +
                        "3: deposit\n" +
                        "4: exit\n" +
                        "Enter a choice: ");
                    choice = sc.nextInt();
                }
                else {
                    break;
                }
                switch (choice){
                    case 1 :
                        System.out.println("The balance is " + bank[id].getBalance());
                        flag = 1;
                        break;
                    case 2 :
                        System.out.printf("Enter an amount to withdraw: ");
                        int mmoney = sc.nextInt();
                        bank[id].withdraw(mmoney);
                        if(mmoney>bank[id].getBalance()){
                            System.out.println("The amount is too large, ignored");
                        }
                        flag = 1;
                        break;
                    case 3 :
                        System.out.printf("Enter an amount to deposit: ");
                        int pmoney = sc.nextInt();
                        bank[id].deposit(pmoney);
                        if(pmoney <0){
                            System.out.println("The amount is negative, ignored");
                        }
                        flag = 1;
                        break;
                    case 4 :
                        System.out.printf("\n");
                        flag =0;
                        break;
                    default:
                        System.out.println("Wrong choice, try again: ");
                        flag = 1;
                        break;
                }
            }
        }
    }
}
class Account{
    int id;
    double balance;
    long dateCreated;
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
    public double getBalance(){
        return balance;
    }
    public void withdraw(double a){
        if(a <= this.balance)
            balance -= a;
    }
    public void deposit(double a){
        this.balance += a;
    }
}