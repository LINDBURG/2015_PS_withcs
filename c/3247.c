#include <stdio.h>
 
int main()
{
    int a, b, c;
 
    while(scanf("%d %d",&a, &b)){
        if(a==-1 && b==-1)
            break;
        if((a==0 &&b==1)||(a==1&&b==0))
            printf("%d+%d=%d\n", a, b, a+b);
        else if(a==0||b==0)
            printf("%d+%d!=%d\n", a, b, a+b);
        else if(a==1||b==1)
            printf("%d+%d=%d\n", a, b, a+b);
        else
            printf("%d+%d!=%d\n", a, b, a+b);
    }
    return 0;
}
