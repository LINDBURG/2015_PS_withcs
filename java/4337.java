import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int n = input.nextInt();
        if(n>=0){
            if(n>=16) {
                System.out.printf("%d", n/16);
            }
            if(n%16<10)
                System.out.printf("%d", n%16);
            else if(n%16==10)
                System.out.printf("a");
            else if(n%16==11)
                System.out.printf("b");
            else if(n%16==12)
                System.out.printf("c");
            else if(n%16==13)
                System.out.printf("d");
            else if(n%16==14)
                System.out.printf("e");
            else if(n%16==15)
                System.out.printf("f");
        }
    }
}