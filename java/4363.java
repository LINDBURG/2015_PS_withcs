import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        int snum = input.nextInt();
        int slot[] = new int[snum];
        input.nextLine();
        for(int i=0;i<num;i++){
            String a = input.nextLine();
            int count = 0;
            for(int j=0;j<snum-1;j++){
                if(a.charAt(j)=='R'){
                    count++;
                }
            }
            slot[count]++;
        }
        for(int i=0;i<snum;i++){
            System.out.println(slot[i]);
        }
    }
}