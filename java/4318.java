import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        System.out.println(num/3600+" "+ ((num/60)-60*(num/3600))+" "+ num%60);
    }
}