import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        for(int i=0;i<num;i++){
            int b = input.nextInt();
            int count=0;
            for(int k=1;k<=b;k++) {
                String a = Integer.toString(k);
                int flag=0;
                for(int j =k-1;j>1;j--){
                    if(k%j==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0) {
                    for (int j = 0; j < a.length() / 2; j++) {
                        if (a.charAt(j) != a.charAt(a.length() - 1 - j)) {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0){
                        count++;
                    }
                }
            }
            System.out.printf("%d",count-1);
            if(i<num-1){
                System.out.printf("%n");
            }
        }
    }
}