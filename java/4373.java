import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        double lim = input.nextDouble();
        double ban[][] = new double[num][num+1];
        for(int i=0;i<num;i++){
            ban[i][i] = input.nextDouble();
            int num2 = input.nextInt();
            for(int j=0;j<num2;j++){
                ban[i][input.nextInt()] += input.nextDouble();
            }
        }
        for(int i =0;i<num;i++){
            double sum=0;
            for(int j=0;j<num;j++){
                sum +=ban[i][j];
            }
            if(sum<lim && ban[i][num]==0){
                for(int j=0;j<num;j++){
                    ban[j][i]=0;
                }
                ban[i][num]=1;
                i=0;
            }
        }
        int bank =0;
        for(int i=0;i<num;i++){
            double sum =0;
            for(int j=0;j<num;j++){
                sum +=ban[i][j];
            }
            if(bank ==0 && sum<lim){
                System.out.printf("%d",i);
                bank=1;
            }
            else if(sum<lim){
                System.out.printf(" %d",i);
            }
        }
    }
}