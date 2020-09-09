import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        int num = input.nextInt();
        int max =0;
        int score[] = new int[num];
        for(int i=0;i<num;i++){
            score[i] = input.nextInt();
            if(score[i]>max){
                max=score[i];
            }
        }
        for(int i=0;i<num;i++){
            if(score[i]>=max-10){
                System.out.printf("A");
            }
            else if(score[i]>=max-20){
                System.out.printf("B");
            }
            else if(score[i]>=max-30){
                System.out.printf("C");
            }
            else if(score[i]>=max-40){
                System.out.printf("D");
            }
            else{
                System.out.printf("F");
            }
            if(i<num-1){
                System.out.printf("%n");
            }
        }
    }
}