#include <stdio.h>
 
main()
{
    int mode, i, t;
    char a;
 
    scanf("%d", &t);
    printf("%d", t);
    mode=0;
    while ((a=getchar())!=EOF){
        if(a=='\t'){
            for(i=0;i<t-(mode%t);i++)
                printf(" ");
            mode=0;
        }
        else if(a=='\n'){
            mode=0;
            printf("\n");
        }
        else{
            putchar(a);
            ++mode;
        }
    }
    return 0;
}