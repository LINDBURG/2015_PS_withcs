#include <stdio.h>
 
int main()
{
    int i=0, c;
    char s[99999]={0};
 
    while ((c=getchar())!=EOF){
        s[i]=c;
        i++;
    }
    s[i]='\0';
    for(i=0;s[i]!='\0';i++){
        if(s[i]=='\\'&& s[i+1]=='n'){
            s[i]='\n';
            for(++i;s[i]!='\0';i++)
                s[i]=s[i+1];
        i=0;
        }
        if(s[i]=='\\'&& s[i+1]=='t'){
            s[i]='\t';
            for(++i;s[i]!='\0';i++)
                s[i]=s[i+1];
        i=0;
        }
        if(s[i]=='\\'&& s[i+1]=='b'){
            s[i]='\b';
            for(++i;s[i]!='\0';i++)
                s[i]=s[i+1];
        i=0;
        }
    }
    printf("%s",s);
    return 0;
}
F