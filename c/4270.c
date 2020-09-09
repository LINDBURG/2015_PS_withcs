#include <stdio.h>
 
main()
{
    char c;
 
    while ((c=getchar())!=EOF){
        if(c=='('){
            putchar(c);
            while((c=getchar())!=')'){
                putchar(c);
            }
            putchar(c);
        }
        else if(c=='/'){
            if((c=getchar())=='*')
                while(c=getchar()){
                    if(c=='\n')
                        putchar(c);
                    if(c=='*' && (c=getchar())=='/')
                        break;
                }
        }
        else
            putchar(c);
    }
}