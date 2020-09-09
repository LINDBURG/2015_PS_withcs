#include<stdio.h>
 
int main()
{
    int c, i=0, j=0,t, b;
    char arr[99]={0}, save[99][99]={0};
 
    scanf("%d", &t);
    for(i=0;(scanf("%s", &arr))!=EOF;i){
        if(strlen(arr)>2){
            j=0;
            if(arr[0]=='-'){
                save[i][0]=arr[0];
                j++;
            }
            for(b=1;b<strlen(arr);b++,j++){
                save[i][j]=arr[b];
            }
            i++;
        }
    }
    for(j=0;j<i &&j<t;j++)
        printf("%s\n", save[j]);
    return 0;
}