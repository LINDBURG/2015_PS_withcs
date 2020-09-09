import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String hex = sc.next();
            int value;
            try {
                value = HexFormat.parseHex(hex);
            } catch (HexFormatException ex) {
                System.out.println(ex);
                continue;
            }
            System.out.println(value);
        }
    }
 
}
 
class HexFormat {
    public static int parseHex(String line) throws HexFormatException{
        int sum=0;
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)>='0' && line.charAt(i)<='9'){
                sum = sum*16 + line.charAt(i)-'0';
            }
            else if(line.charAt(i)>='A' && line.charAt(i)<='F'){
                sum = sum*16 + line.charAt(i)-'A'+10;
            }
            else{
                throw new HexFormatException(line);
            }
        }
        return sum;
    }
}
 
class HexFormatException extends Exception{
    int i;
    char fix;
    public HexFormatException(String line){
        for(i=0;i<line.length();i++) {
            if (!(line.charAt(i) >= '0' && line.charAt(i) <= '9' || line.charAt(i) >= 'A' && line.charAt(i) <= 'F')) {
                ;
                fix = line.charAt(i);
                break;
            }
        }
    }
    public String toString() {
        return String.format("HexFormatException: Illegal hex character: %c",fix);
    }
 
}