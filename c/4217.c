#include <stdio.h>
 
main()
{
    int c, i, t;
    char arr[2][2000]={0};
 
    for (i=0;(c=getchar())!='\n';++i)
        arr[0][i]=c;
    for (t=0;(c=getchar())!= EOF;++t)
        arr[1][t]=c;
    for (i=0;arr[0][i]!='\0';++i){
        for (t=0;arr[1][t]!='\0';++t){
            if(arr[0][i]==arr[1][t]){
                for(c=i;arr[0][c]!='\0';++c)
                    arr[0][c]=arr[0][c+1];
                t=0;
            }
        }
    }
    for(i=0;arr[0][i]!='\0';++i)
        printf("%c",arr[0][i]);
}