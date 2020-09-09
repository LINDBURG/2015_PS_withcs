#include <stdio.h>
 
int main()
{
    int i, c, type[10]={0};
 
    while((c=getchar())!=EOF){
        type[0]=c;
        for(i=1;(c=getchar())!=' ';i++)
            type[i]=c;
        if(type[0]=='l'&&type[1]=='o'){
            for(;(c=getchar())!='\n' && c!=EOF;){
                if(c>='A'&&c<='Z')
                    c+=32;
                printf("%c", c);
            }
        }
        else if(type[0]=='u'&&type[1]=='p'){
            for(;(c=getchar())!='\n' && c!=EOF;){
                if(c>='a'&&c<='z')
                    c-=32;
                printf("%c", c);
            }
        }
        printf("\n");
    }
    return 0;
}