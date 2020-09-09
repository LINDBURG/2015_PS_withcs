#include <stdio.h>
 
int main()
{
    int i=0, c;
    char s[99999]={0};
 
    while ((c=getchar())!=EOF){
        s[i]=c;
        if(c=='\n'){
            s[i++]='\\';
            s[i]='n';
        }
        else if(c=='\t'){
            s[i++]='\\';
            s[i]='t';
        }
        else if(c=='\b'){
            s[i++]='\\';
            s[i]='b';
        }
        ++i;
    }
    printf("%s",s);
    return 0;
}