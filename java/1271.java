import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long  p, q, n, temp;
        int max, count;
 
        while(sc.hasNext()){
            p = sc.nextInt();
            q = sc.nextInt();
            if(p ==-1 || q ==-1){
                break;
            }
            if(p<=q){
                for(max=1, temp=p;temp<=q;temp++){
                    for(count=1, n=temp;n!=1;count++){
                        if(n%2==1)
                            n=3*n+1;
                        else
                            n/=2;
                    }
                    if(count>max)
                        max=count;
                }
            }
            else{
                for(max=1, temp=q;temp<=p;temp++){
                    for(count=1, n=temp;n!=1;count++){
                        if(n%2==1)
                            n=3*n+1;
                        else
                            n/=2;
                    }
                    if(count>max)
                        max=count;
                }
            }
            System.out.println( p+ " "+q+" "+ max);
        }
    }
}