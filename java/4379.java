import java.util.*;
public class Main {
 
    public static int max=1, x ,y ,flag = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int num =  input.nextInt();
        int arr[][] = new int[4][2];
        double area[] = new double[4];
        for(int i=0;i<num;i++){
            for(int j=0;j<4;j++){
                arr[j][0] = input.nextInt();
                arr[j][1] = input.nextInt();
            }
            double a = arr[0][1] - arr[2][1];
            double b = arr[2][0] - arr[0][0];
            double c = arr[1][1] - arr[3][1];
            double d = arr[3][0] - arr[1][0];
            double e = (arr[0][1] - arr[2][1])*arr[0][0] - (arr[0][0] - arr[2][0])*arr[0][1];
            double f = (arr[1][1] - arr[3][1])*arr[1][0] - (arr[1][0] - arr[3][0])*arr[1][1];
 
            double x = (d*e - b*f)/(a*d - b*c);
            double y = (a*f - e*c)/(a*d - b*c);
 
            for(int j=0;j<4;j++){
                double side1 =0;
                double side2 =0;
                if(j<3) {
                    side1 = Math.sqrt(Math.pow(arr[j][0] - arr[j + 1][0], 2) + Math.pow(arr[j][1] - arr[j + 1][1], 2));
                    side2 = Math.sqrt(Math.pow(arr[j + 1][0] - x, 2) + Math.pow(arr[j + 1][1] - y, 2));
                }
                else{
                    side1 = Math.sqrt(Math.pow(arr[j][0] - arr[0][0], 2) + Math.pow(arr[j][1] - arr[0][1], 2));
                    side2 = Math.sqrt(Math.pow(arr[0][0] - x, 2) + Math.pow(arr[0][1] - y, 2));
                }
                double side3 = Math.sqrt(Math.pow(arr[j][0]-x,2)+Math.pow(arr[j][1]-y,2));
                double S = (side1 + side2 + side3)/2;
                area[j] = Math.sqrt(S*(S - side1)*(S - side3)*(S - side2));
            }
            Arrays.sort(area);
            for(int j=0;j<4;j++){
                System.out.printf("%.2f",area[j]);
                if(j<3){
                    System.out.printf(" ");
                }
            }
            if(i<num-1){
                System.out.printf("%n");
            }
        }
    }
}