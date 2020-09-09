import java.util.Scanner;
public class Main{
 
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        for(int i=0;i<num;i++){
            int snum = input.nextInt();
            int dnum = input.nextInt();
            int door[] = new int[snum+1];
            for(int j=1;j<=snum;j++){
                for(int k=1;j*k<=snum;k++){
                    if(door[k*j]==0){
                        door[k*j]=1;
                    }
                    else{
                        door[k*j]=0;
                    }
                }
            }
            if(door[dnum]==0){
                System.out.println("close");
            }
            else {
                System.out.println("open");
            }
        }
    }
}