import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        input.nextLine();
        String a[] = new String[100];
        for(int i=0;i<num;i++){
            a[i] = input.nextLine();
        }
        int small = 100;
        int smallth =0;
        String smallst ="";
        for(int i=0;i<num;i++){
            if(small>a[i].length()){
                small =a[i].length();
                smallth = i;
                smallst=a[i];
            }
        }
        for(int i=0;smallst.length()>=1;){
            int count=0;
            for(int j=0;j<num;j++){
                for(int k=0;k+smallst.length()<=a[j].length();k++){
                    if(smallst.equals(a[j].substring(k,k+smallst.length()))){
                        count++;
                        break;
                    }
                }
            }
            if(count==num){
                break;
            }
            if(i+smallst.length()==small){
                smallst=a[smallth].substring(0,smallst.length()-1);
                i=0;
            }
            else{
                i++;
                smallst=a[smallth].substring(i,i+smallst.length());
            }
        }
        System.out.printf("%s",smallst);
    }
}