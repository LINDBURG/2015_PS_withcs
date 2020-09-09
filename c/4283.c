#include <stdio.h>
 
int main()
{
    int c, t, i, j, k, line=0;
 
    scanf("%d",&t);
    j=1;
    t=(t+1)/2;
    for(;t>0;t--){
        c=t;
        i=t;
        for(;c>1;c--)
            printf(" ");
        for(c=0;j>c;++c)
            printf("*");
        printf("\n");
        j+=2;
        ++line;
    }
    k=1;
    j-=4;
    for(;line>1;line--){
        for(i=0;i<k;++i)
            printf(" ");
        for(c=0;j>c;++c)
            printf("*");
        printf("\n");
        j-=2;
        k+=1;
    }
}