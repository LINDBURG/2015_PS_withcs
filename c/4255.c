#include <stdio.h>
 
int main()
{
    int c, ns, nt, nl;
 
    ns=nt=nl=0;
    while ((c=getchar()) !=EOF){
        if (c==' ')
            ++ns;
        else if (c=='\t')
            ++nt;
        else if (c=='\n')
            ++nl;
    }
    printf("%d\n%d\n%d\n", ns, nt, nl);
}