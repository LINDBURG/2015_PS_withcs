import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        String temp = a;
 
        if(a.compareTo(b)>0){
            temp = a;
            a = b;
            b = temp;
        }
        if(b.compareTo(c)>0){
            temp = b;
            b = c;
            c = temp;
        }
        if(a.compareTo(b)>0){
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a +" "+ b+" "+ c);
    }
}