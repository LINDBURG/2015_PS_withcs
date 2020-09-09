#include <stdio.h>
 
main()
{
    int c, i, t, l,state=0;
    char arr[2][200]={0};
 
    for (i=0;(c=getchar())!='\n';++i)
        arr[0][i]=c;
    for (t=0;(c=getchar())!= EOF;++t)
        arr[1][t]=c;
    for (i=0;arr[0][i]!='\0';++i){
        for (t=0;arr[1][t]!='\0';++t){
            if(arr[0][i]==arr[1][t]){
                l=i;
                state=1;
                break;
            }
        }
        if(state==1)
            break;
    }
    if(state==1)
        printf("%d",l);
    else{
        printf("-1");
        return -1;
    }
}