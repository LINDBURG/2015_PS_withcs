import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        Calendar d = Calendar.getInstance();
        for(int i=sc.nextInt();i>0;i--){
            d.set(sc.nextInt(),sc.nextInt()-1,sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            d.add(Calendar.DATE,1000);
            d.add(Calendar.SECOND,-1000);
            d.add(Calendar.MONTH,1);
            String s = "";
            s+=d.get(Calendar.YEAR)+".";
            if(d.get(Calendar.MONTH)<10)
                s+="0";
            s+=d.get(Calendar.MONTH) + ".";
            if(d.get(Calendar.DATE)<10)
                s+="0";
            s+=d.get(Calendar.DATE) + " ";
            if(d.get(Calendar.HOUR_OF_DAY)<10)
                s+="0";
            s+=d.get(Calendar.HOUR_OF_DAY) + ":";
            if(d.get(Calendar.MINUTE)<10)
                s+="0";
            s+=d.get(Calendar.MINUTE) + ":";
            if(d.get(Calendar.SECOND)<10)
                s+="0";
            s+=d.get(Calendar.SECOND);
 
            System.out.println(s);
        }
    }
}