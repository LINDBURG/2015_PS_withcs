import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int re = sc.nextInt();
        sc.nextLine();
        for(;re>0;re--){
            String line = sc.nextLine();
            int[] arr = new int[(line.length()+1)/2];
            int sum = 0;
            for(int i = 0;i*2<=line.length();i++){
                arr[i] = line.charAt(i*2)-48;
                sum += arr[i];
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                if(sum%3==1){
                    for(int j=0;j<arr.length;j++){
                        if(arr[j] ==1){
                            arr[j] = -1;
                            sum-=1;
                            break;
                        }
                        else if(arr[j] ==4){
                            arr[j] = -1;
                            sum-=4;
                            break;
                        }
                        else if(arr[j] ==7){
                            arr[j] = -1;
                            sum-=7;
                            break;
                        }
                    }
                }
                else if(sum%3==2){
                    int j=0;
                    for(;j<arr.length;j++){
                        if(arr[j] ==2){
                            arr[j] = -1;
                            sum-=2;
                            break;
                        }
                        else if(arr[j] ==5){
                            arr[j] = -1;
                            sum-=5;
                            break;
                        }
                        else if(arr[j] ==8){
                            arr[j] = -1;
                            sum-=8;
                            break;
                        }
                    }
                    if(j==arr.length){
                        for(j=0;j<arr.length;j++){
                            if(arr[j] ==1){
                                arr[j] = -1;
                                sum-=1;
                                break;
                            }
                            else if(arr[j] ==4){
                                arr[j] = -1;
                                sum-=4;
                                break;
                            }
                            else if(arr[j] ==7){
                                arr[j] = -1;
                                sum-=7;
                                break;
                            }
                        }
                    }
                }
                else {
                    break;
                }
            }
            String s ="";
            for(int i = arr.length-1;i>=0;i--){
                if(arr[i] >=0 && arr[i]<=9){
                    s+= arr[i];
                }
            }
            if(s.length()>0)
                System.out.println(s);
            else{
                System.out.println("0");
            }
        }
    }
}