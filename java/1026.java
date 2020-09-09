import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int i;
        float dist=0,time1=0, time2=0, spd=0;
 
        String line = sc.nextLine();
        time1=(line.charAt(0)-'0')*36000+(line.charAt(1)-'0')*3600+(line.charAt(3)-'0')*600+(line.charAt(4)-'0')*60+(line.charAt(6)-'0')*10+line.charAt(7)-'0';
        if(line.length()<=8){
            System.out.printf("%s %.2f km\n", line, dist);
        }
        else{
            for(i=9, spd=0;i<line.length();i++){
                spd=spd*10+(line.charAt(i)-'0');
            }
        }
        while(sc.hasNext()){
            line = sc.nextLine();
            time2=(line.charAt(0)-'0')*36000+(line.charAt(1)-'0')*3600+(line.charAt(3)-'0')*600+(line.charAt(4)-'0')*60+(line.charAt(6)-'0')*10+line.charAt(7)-'0';
            dist+=(time2-time1)*spd/3600;
            if(line.length()<=8){
                System.out.printf("%s %.2f km\n", line, dist);
            }
            else{
                for(i=9, spd=0;i<line.length();i++){
                    spd=spd*10+(line.charAt(i)-'0');
                }
            }
            time1=time2;
        }
    }
}