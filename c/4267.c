#include <stdio.h>
 
main()
{
    int mode;
    char a;
 
    mode=0;
    while ((a=getchar())!=EOF){
        ++mode;
        if(a=='\t'){
            if(mode%4==1)
                printf("    ");
            else if(mode%4==2)
                printf("   ");
            else if(mode%4==3)
                printf("  ");
            else if(mode%4==0)
                printf(" ");
            mode=0;
        }
        else if(a=='\n'){
            mode=0;
            printf("\n");
        }
        else
            putchar(a);
    }
}
