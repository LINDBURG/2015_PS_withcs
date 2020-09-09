import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
 
        String c = input.next();
        if(c.charAt(0) == 'M'){
            System.out.printf("Mathematics ");
        }
        else if(c.charAt(0) == 'C'){
            System.out.printf("Computer Science ");
        }
        else if(c.charAt(0) == 'I'){
            System.out.printf("Information Technology ");
        }
        if(c.charAt(1) == '1'){
            System.out.printf("Freshman");
        }
        else if(c.charAt(1) == '2'){
            System.out.printf("Sophomore");
        }
        else if(c.charAt(1) == '3'){
            System.out.printf("Junior");
        }
        else if(c.charAt(1) == '4'){
            System.out.printf("Senior");
        }
    }
}