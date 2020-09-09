import java.util.Scanner;
public class Main{
 
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        String name[] = new String[num];
        int hour[] = new int[num];
        for(int i=0;i<num;i++){
            name[i] = input.next();
            for(int j=0;j<7;j++){
                hour[i]+=input.nextInt();
            }
        }
        for(int i=0;i<num;i++){
            int maxi = 0;
            for(int j=0;j<num;j++){
                if(hour[maxi]<hour[j]){
                    maxi=j;
                }
            }
            System.out.println(name[maxi] + " "+ hour[maxi]);
            hour[maxi]=0;
        }
    }
}