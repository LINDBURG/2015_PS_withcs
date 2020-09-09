import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String b = sc.nextLine();
        String a = "";
        while(sc.hasNextLine()){
            a = b;
            b = sc.nextLine();
            if(b.matches(".*[{]$")){
                System.out.printf(a);
                System.out.println(" {");
                b= sc.nextLine();
            }
            else{
                System.out.println(a);
            }
        }
        System.out.println(b);
    }
}