#include <stdio.h>
 
int main()
{
    int c,i;
    int arr[94];
 
    for (i=0;i<94;++i)
        arr[i]=0;
 
    while ((c=getchar())!=EOF){
        for(i=0;i<94;++i){
            if(c==i+'!')
               ++arr[i];
        }
    }
    for(i=0;i<94;++i){
        printf("%c: ", i+'!');
        for (c=0;c<arr[i];++c)
            printf("*");
        printf("\n");
    }
}