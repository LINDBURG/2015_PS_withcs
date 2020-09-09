import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        move(line.length(),line,"");
    }
 
    public static void move(int n,String line,String sline){
        if(n==1){
            System.out.println(sline+line);
        }
        else{
            for(int i =0;i<n;i++){
                String s =line.substring(0,i);
                s+=line.substring(i+1);
                move(n-1,s,sline+line.charAt(i));
            }
        }
    }
}