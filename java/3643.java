import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int line = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=line;i++){
            String[] s = sc.nextLine().split(" ");
            System.out.printf("%d ",i);
            int j=s[1].length()-1;
            for(;j>0;j--){
                if(s[1].charAt(j)>s[1].charAt(j-1)){
                    break;
                }
            }
            if(j==0){
                System.out.println("BIGGEST");
            }
            else{
                System.out.printf(s[1].substring(0, j - 1));
                String ns = s[1].substring(j);
                for(int k=ns.length()-1;k>=0;k--){
                    if(ns.charAt(k)>s[1].charAt(j-1)){
                        System.out.print(ns.charAt(k));
                        int m=ns.length()-1;
                        for(;m>k;m--){
                            System.out.printf("%c",ns.charAt(m));
                        }
                        System.out.printf("%c",s[1].charAt(j-1));
                        for(m--;m>=0;m--){
                            System.out.printf("%c",ns.charAt(m));
                        }
                        System.out.printf("\n");
                        break;
                    }
                }
            }
        }
    }
}