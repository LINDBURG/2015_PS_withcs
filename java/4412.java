import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String str = sc.next();
            String delimiter = sc.next();
 
            String tokens = split(str, delimiter);
            System.out.println(tokens);
        }
    }
 
    public static String split(String s, String d){
    Pattern p = Pattern.compile(d);
    Matcher m = p.matcher(s);
    
    StringBuffer sb = new StringBuffer();
    for(;m.find();){
        m.appendReplacement(sb, ","+m.group()+",");
    }
    m.appendTail(sb);
    return sb.toString();
}
 
}