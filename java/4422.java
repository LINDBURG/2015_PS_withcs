import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int min=0;
        String line = sc.nextLine();
        int temp=0;
        for(int j=0,flag =0;j<line.length();j++){
            if(line.charAt(j)>=48 && line.charAt(j)<58){
                temp = temp*10+line.charAt(j)-48;
            }
            else{
                if(flag ==0){
                    min = temp;
                    flag =1;
                }
                else if(min>temp){
                    min =temp;
                }
                temp =0;
            }
        }
        if(min>temp){
            min =temp;
        }
        System.out.println(min);
    }
}