import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        String a[] = new String[8];
        int flag =0;
        for(int i=0;i<8;i++){
            a[i]=input.nextLine();
            int count=0;
            int q=0;
            int ql=0;
            int qr=0;
            for(int j=0;j<8;j++){
                if(a[i].charAt(j)=='Q'){
                    q=j;
                    ql=j-1;
                    qr=j+1;
                    count++;
                }
            }
            if(count!=1){
                flag=1;
                break;
            }
            for(int j=i-1;j>=0;j--,ql--,qr++){
                if(a[j].charAt(q)=='Q'){
                    flag=1;
                    break;
                }
                if(ql>=0 && a[j].charAt(ql)=='Q'){
                    flag=1;
                    break;
                }
                if(qr<=7 && a[j].charAt(qr)=='Q'){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.printf("Valid");
        }
        else{
            System.out.printf("Invalid");
        }
    }
}