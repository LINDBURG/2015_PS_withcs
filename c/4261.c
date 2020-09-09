#include <stdio.h>
 
int main()
{
    int c,i,t;
    int arr[10];
 
    for (i=0;i<10;++i)
        arr[i]=0;
 
    while ((c=getchar())!=EOF){
        for(i=0;i<10;++i){
            if(c==i+48)
               ++arr[i];
        }
    }
    t=arr[0];
    for(i=1;i<10;++i){
        if(arr[i]>t)
            t=arr[i];
    }
    for(c=t;c>=1;c--){
        for(i=0;i<10;++i){
            if(c-arr[i]<=0)
                printf("*");
            else
                printf(" ");
        }
        printf("\n");
    }
    for(i=0;i<10;++i)
        printf("-");
    printf("\n");
    for(i=0;i<10;++i)
        printf("%d",i);
}