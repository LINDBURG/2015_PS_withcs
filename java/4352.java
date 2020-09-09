import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        for(int j =0;j<num;j++){
            if(j==0){
                String a = input.nextLine();
            }
            String a = input.nextLine().toLowerCase();
            int vow = 0;
            int no = 0;
            for(int i = 0;i<a.length();i++){
                if(a.charAt(i)=='a'||a.charAt(i)=='i'||a.charAt(i)=='e'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                    vow++;
                }
                else if (a.charAt(i)==' '){
 
                }
                else {
                    no++;
                }
            }
            System.out.printf("%d %d",vow,no);
            if(j<num-1)
                System.out.printf("%n");
        }
    }
}