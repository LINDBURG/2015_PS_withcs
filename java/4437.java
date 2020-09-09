import java.util.*;
 
public class Main {
    public static int Time;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int n = input.nextInt();
            Time=0;
            move(n,'A','B','C');
            System.out.println(Time);
        }
    }
    public static void move(int n, char from, char to,char aux){
        if(from=='A'&& to=='B'){
            Time++;
        }
        if(n!=1){
            move(n-1,from,aux,to);
            move(n-1,aux,to,from);
        }
    }
}