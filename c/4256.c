#include <stdio.h>
 
int main()
{
    int c,t;
    t=getchar();
    putchar(t);
    while ((c=getchar())!=EOF){
        if ((c==' ') && (t==' '))
            t=c;
        else{
            putchar(c);
            t=c;
        }
    }
}