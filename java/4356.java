import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        input.nextLine();
        for(int i=0;i<num;i++){
            String a = input.nextLine().toLowerCase();
            int flag =0;
            int ncnt =0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)>='0' &&a.charAt(j)<='9'){
                    ncnt++;
                }
                else if(a.charAt(j)>='a' &&a.charAt(j)<='z'){
                }
                else{
                    flag=1;
                    break;
                }
            }
            if(a.length()>=8 && ncnt>=2 && flag==0){
                System.out.printf("Valid");
            }
            else{
                System.out.printf("Invalid");
            }
            if(i<num-1){
                System.out.printf("%n");
            }
        }
    }
}