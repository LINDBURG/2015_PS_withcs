import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int  ns, nt, nl;
        char c;
        String s;
 
        ns=nt=nl=0;
        while (sc.hasNextLine()){
            nl++;
            s = sc.nextLine();
            for(int i=0;i<s.length();i++){
                c = s.charAt(i);
                if (c==' ')
                    ++ns;
                else if (c=='\t')
                    ++nt;
            }
        }
        System.out.printf("%d\n%d\n%d\n", ns, nt, nl);
    }
}