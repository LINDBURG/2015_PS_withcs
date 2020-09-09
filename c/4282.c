#include <stdio.h>
 
int main()
{
    int c, t, i, j;
 
    scanf("%d",&t);
    j=1;
    for(;t>0;t--){
        c=t;
        i=t;
        for(;c>1;c--)
            printf(" ");
        for(c=0;j>c;++c)
            printf("*");
        printf("\n");
        j+=2;
    }
}