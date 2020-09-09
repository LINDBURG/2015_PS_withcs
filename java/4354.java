import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        input.nextLine();
        for(int i=0;i<num;i++){
            String a = input.nextLine();
            int flag=0;
            for(int j=0;j<a.length()/2;j++){
                if(a.charAt(j)!=a.charAt(a.length()-1-j)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.printf("Y");
            }
            else{
                System.out.printf("N");
            }
            if(i!=num){
                System.out.printf("%n");
            }
        }
    }
}