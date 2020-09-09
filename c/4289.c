#include <stdio.h>
#include <stdlib.h>
 
int main()
{
    int i, c, j=0, k;
    char t,arr[999]={0};
 
    scanf("%c ",&t);
    gets(arr);
    for(i=0,k=0;arr[k]!='\0';k++,i++){
        if(arr[k]==t)
            j=i;
    }
    if(j==0)
        printf("null");
    else
        printf("%d",j);
    return 0;
}