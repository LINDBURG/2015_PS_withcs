import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        input.nextLine();
        for(int i=0;i<num;i++){
            String card = input.nextLine();
            int sum = 0;
            for(int j=0;j<card.length();j++){
                if(j%2==0){
                    sum+=card.charAt(card.length()-j-1)-'0';
                }
                else{
                    if(card.charAt(card.length()-j-1)-'0'<5){
                        sum+=(card.charAt(card.length()-j-1)-'0')*2;
                    }
                    else{
                        sum+=(card.charAt(card.length()-j-1)-'0')*2%10+1;
                    }
                }
            }
            if(sum%10==0 && (card.charAt(0)=='4' || (card.charAt(0)=='3'&&card.charAt(1)=='7')||card.charAt(0)=='5'||card.charAt(0)=='6')){
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
