#include <stdio.h>
 
int arr[5001][5001];
int main()
{
    int i, j, t, count;
 
    for(i=0, j=0, count=0;i<=5000&&j<=5000;count++){
        arr[i][j]=count;
        if(count%4==0){
            i++;
            j++;
        }
        else if(count%4==1){
            i++;
            j--;
        }
        else if(count%4==2){
            i++;
            j++;
        }
        else if(count%4==3){
            i--;
            j++;
        }
    }
    scanf("%d", &t);
    for(;t>0;t--){
        scanf("%d %d", &i, &j);
        if(i==0&& j==0)
            printf("0\n");
        else if(arr[i][j]!='\0')
            printf("%d\n", arr[i][j]);
        else
            printf("No Number\n");
    }
    return 0;
}