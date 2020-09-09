#include <stdio.h>
 
int main()
{
    int c,i;
    int arr[10];
 
    for (i=0;i<10;++i)
        arr[i]=0;
 
    while ((c=getchar())!=EOF){
        for(i=0;i<10;++i){
            if(c==i+48)
               ++arr[i];
        }
    }
    for(i=0;i<10;++i){
        printf("%d: ", i);
        for (c=0;c<arr[i];++c)
            printf("*");
        printf("\n");
    }
}