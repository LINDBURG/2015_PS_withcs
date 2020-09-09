import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            char ch = sc.next().charAt(0);
            MyCharacter c = new MyCharacter(ch);
            System.out.println(c.charValue());
            System.out.println(c.compareTo(new MyCharacter('i')));
            System.out.println(c.equals(new MyCharacter('i')));
            System.out.println(c.isDigit());
            System.out.println(c.isDigit(ch));
            System.out.println(MyCharacter.isDigit(ch));
            System.out.println(MyCharacter.isLetter(ch));
            System.out.println(MyCharacter.isLetterOrDigit(ch));
            System.out.println(MyCharacter.isLowerCase(ch));
            System.out.println(MyCharacter.isUpperCase(ch));
            System.out.println(MyCharacter.toUpperCase(ch));
            System.out.println(MyCharacter.toLowerCase(ch));
        }
    }
}
 
class MyCharacter{
    char cha;
    public MyCharacter(char ch){
        cha = ch;
    }
    public char charValue(){
        return cha;
    }
    public int compareTo(MyCharacter n){
        return cha - n.cha;
    }
    public boolean equals(MyCharacter n){
        return (cha==n.cha);
    }
    public boolean isDigit(){
        return (cha>=48 && cha<58);
    }
    public static boolean isDigit(char ch){
        return (ch>=48 && ch<58);
    }
    public static boolean isLetter(char ch){
        return (ch>='a' && ch<='z' || ch>='A' && ch<='Z');
    }
    public static boolean isLetterOrDigit(char ch){
        return (ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>=48 && ch<58);
    }
    public static boolean isLowerCase(char ch){
        String s = "";
        s+= ch;
        return (s.toLowerCase().equals(s) && (ch>='a' && ch<='z' || ch>='A' && ch<='Z'));
    }
    public static boolean isUpperCase(char ch){
        String s = "";
        s+= ch;
        return (s.toUpperCase().equals(s) && (ch>='a' && ch<='z' || ch>='A' && ch<='Z'));
    }
    public static String toUpperCase(char ch){
        String s = "";
        s+= ch;
        return s.toUpperCase();
    }
    public static String toLowerCase(char ch){
        String s = "";
        s+= ch;
        return s.toLowerCase();
    }
}