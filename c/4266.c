#include <stdio.h>
 
main()
{
    int c,i,t,now;
    char arr[20000];
 
    now=0;
    t=0;
    while(t!=EOF){
        c=getchar();
        if (c!='\n' && c!=EOF){
            arr[now]=c;
            ++now;
        }
        else {
            for(i=now;i>0;i--)
                printf("%c",arr[i-1]);
            printf("\n");
            now=0;
        }
        t=c;
    }
    return 0;
}