import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        while(true){
            int line = sc.nextInt();
            if(line==0){
                break;
            }
            int cnt = 0;
            int[][] stu = new int[2][line];
            for(int i=0;i<line;i++){
                stu[0][i] = sc.nextInt();
            }
            while(true){
                int flag =0;
                for(int i=0;i<line-1;i++){
                    if(stu[0][i]!=stu[0][i+1]){
                        break;
                    }
                    if(i==line-2){
                        flag=1;
                    }
                }
                if(flag==1 || line==1){
                    System.out.printf("%d %d\n",cnt,stu[0][0]);
                    break;
                }
                else{
                    cnt++;
                    for(int i=0;i<line;i++){
                        stu[1][i] = stu[0][i] = stu[0][i]/2;
                    }
                    stu[0][0] +=stu[1][line-1];
                    if(stu[0][0]%2==1){
                        stu[0][0]++;
                    }
                    for(int i=1;i<line;i++){
                        stu[0][i] +=stu[1][i-1];
                        if(stu[0][i]%2==1){
                            stu[0][i]++;
                        }
                    }
                }
            }
        }
    }
}