import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int i, j, count, a ,b;
        int[] A = new int[99], B = new int[99], C = new int[99];
 
        count = sc.nextInt();
        sc.nextLine();
        for(i=1;i<=count;i++){
            String[] c = sc.nextLine().split(" ");
            for(j=0;j<99;j++)
                C[j]=0;
            for(a=0;a<c[0].length();a++){
                A[a]=c[0].charAt(a)-'0';
            }
            a--;
            for(b=0;b<c[1].length();b++){
                B[b]=c[1].charAt(b)-'0';
            }
            b--;
            if(a>b){
                for(j=0;b>=0;a--, b--, j++){
                    C[j]+=A[a]+B[b];
                    if(C[j]==2){
                        C[j+1]=1;
                        C[j]=0;
                    }
                    else if(C[j]==3){
                        C[j+1]=1;
                        C[j]=1;
                    }
                }
                for(;a>=0;a--, j++){
                    C[j]+=A[a];
                    if(C[j]==2){
                        C[j+1]=1;
                        C[j]=0;
                    }
                    else if(C[j]==3){
                        C[j+1]=1;
                        C[j]=1;
                    }
                }
            }
            else if(a==b){
                for(j=0;a>=0;a--, j++){
                    C[j]+=A[a]+B[a];
                    if(C[j]==2){
                        C[j+1]=1;
                        C[j]=0;
                    }
                    else if(C[j]==3){
                        C[j+1]=1;
                        C[j]=1;
                    }
                }
            }
            else{
                for(j=0;a>=0;a--, b--, j++){
                    C[j]+=A[a]+B[b];
                    if(C[j]==2){
                        C[j+1]=1;
                        C[j]=0;
                    }
                    else if(C[j]==3){
                        C[j+1]=1;
                        C[j]=1;
                    }
                }
                for(;b>=0;b--, j++){
                    C[j]+=B[b];
                    if(C[j]==2){
                        C[j+1]=1;
                        C[j]=0;
                    }
                    else if(C[j]==3){
                        C[j+1]=1;
                        C[j]=1;
                    }
                }
            }
            if(C[j]==0)
                j--;
            System.out.printf("%d ", i);
            for(;j>=0;j--)
                System.out.printf("%d", C[j]);
            System.out.printf("\n");
        }
    }
}