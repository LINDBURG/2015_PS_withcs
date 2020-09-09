import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        input.nextLine();
        for(int i=0;i<num;i++){
            String a = input.nextLine().toLowerCase();
            int str[] = new int[100];
            for(int j=0;j<a.length();j++){
                int temp=a.charAt(j)-'a';
                if(temp>=0 && temp<=17){
                    System.out.printf("%d",temp/3+2);
                }
                else if(18<=temp && temp<=21){
                    System.out.printf("%d",(temp-15)/4+7);
                }
                else if(temp>=22 && temp<=25){
                    System.out.printf("9");
                }
                else{
                    System.out.printf("%c", a.charAt(j));
                }
            }
            if(i<num-1){
                System.out.printf("%n");
            }
        }
    }
}