import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < T; t++) {
            String[] line = sc.nextLine().split(" ");
            try {
                if (line[1].equals("+")) {
                    System.out.printf("%s + %s = %d\n", line[0], line[2], Integer.parseInt(line[0]) + Integer.parseInt(line[2]));
                } else if (line[1].equals("-")) {
                    System.out.printf("%s - %s = %d\n", line[0], line[2], Integer.parseInt(line[0]) - Integer.parseInt(line[2]));
                } else if (line[1].equals("*")) {
                    System.out.printf("%s * %s = %d\n", line[0], line[2], Integer.parseInt(line[0]) * Integer.parseInt(line[2]));
                } else if (line[1].equals("/")) {
                    System.out.printf("%s / %s = %d\n", line[0], line[2], Integer.parseInt(line[0]) / Integer.parseInt(line[2]));
                } else if (line[1].equals("%")) {
                    System.out.printf("%s %% %s = %d\n", line[0], line[2], Integer.parseInt(line[0]) % Integer.parseInt(line[2]));
                }
            }
            catch(Exception e){
                int i=0;
                try{
                    Integer.parseInt(line[0]);
                }
                catch(Exception ex){
                    System.out.println("Wrong Input: " + line[0]);
                    i=1;
                }
                if(i==0) System.out.println("Wrong Input: " + line[2]);
            }
        }
    }
}