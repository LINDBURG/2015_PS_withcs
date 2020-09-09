#include <stdio.h>
 
int main()
{
    int c,t, state;
    t=getchar();
    putchar(t);
    while ((c=getchar())!=EOF){
        state=1;
        if (('a'<=t && t<='z') || ('A'<=t && t<='Z') || ('0'<=t && t<='9'))
            state=0;
        if (('a'<=c && c<='z') || ('A'<=c && c<='Z') || ('0'<=c && c<='9')){
            putchar(c);
            t=c;
        }
        if (state==0 && (('a'<=c && c<='z') || ('A'<=c && c<='Z') || ('0'<=c && c<='9'))){
            t=c;
            state=2;
        }
        if (state==0){
            printf("\n");
            t=c;
        }
        else
            t=c;
    }
}