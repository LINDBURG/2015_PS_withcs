import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        input.nextLine();
        for(int i=0;i<num;i++){
            String a = input.nextLine();
            for(int j=a.length()-1;j>=0;j--){
                System.out.printf("%c",a.charAt(j));
            }
            if(i!=num){
                System.out.printf("%n");
            }
        }
    }
}