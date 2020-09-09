import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        for(int i=0;i<num;i++){
            int target = input.nextInt();
            String line = input.nextLine();
            String s = line.substring(1,target);
            s += line.substring(target+1);
            System.out.printf("%d ",i+1);
            System.out.println(s);
        }
    }
}