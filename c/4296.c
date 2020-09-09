#include <stdio.h>
 
int main()
{
    int c, a, i;
    char line[99]={0};
 
    scanf("%c\n", &c);
    for(i=0;(a=getchar())!='\n' && a!=EOF;i++)
        line[i]=a;
    if(line[i-1]==c)
        printf("1");
    else
        printf("0");
    return 0;
}