import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int[] a = new int[1000];
        int[] b = new int[1000];
        int[] c = new int[1000];
 
        int n= sc.nextInt();
        int j=0;
        for(;j<1000;j++){
            c[j] = 0;
            a[j] =-1;
        }
        a[0] = b[0] = 1;
        if(n==1 || n==2){
            j = 1;
        }
        for(int i=0;i<n-2;i++){
            for(j=0;a[j]!=-1;j++){
                c[j]=a[j]+b[j];
                a[j]=b[j];
                b[j]=c[j];
                c[j]=0;
                if(b[j]>9){
                    if(a[j+1]==-1)
                        a[j+1]=1;
                    else
                        a[j+1]++;
                    b[j]%=10;
                }
            }
        }
        for(;j>0;j--)
            System.out.printf("%d", b[j-1]);
    }
}