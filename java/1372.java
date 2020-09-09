import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, count=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] land = new char[100][100];
        sc.nextLine();
        for(i=0;i<n;i++){
            String line = sc.nextLine();
            for(j=0;j<m;j++){
                land[i][j]=line.charAt(j);
                if(land[i][j]=='W')
                    count++;
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(land[i][j]=='W'){
                    if(land[i][j+1]=='W'|| land[i+1][j]=='W'|| land[i+1][j+1]=='W' || land[i+1][j-1]=='W')
                        count--;
                }
            }
        }
        System.out.printf("%d", count);
    }
}