#include <stdio.h>
#include <string.h>
 
int main(){
 
    int c, i, wlen, state;
    char word[99];
 
    while((c=getchar())!=EOF){
        for(i=0;i<99;i++)
            word[i]='\0';
        word[0]=c;
        state=0;
        for(i=1;((c=getchar())!=EOF && c!=' ' && c!='\n') || state==1;i++){
            word[i]=c;
            if(word[0]=='/' && word[1]=='*')
                state=1;
            if(word[i-1]=='*' && word[i]=='/')
                state=0;
        }
        wlen=strlen(word);
        if(word[0]=='_')
            printf("id");
        else if(word[0]=='\'' && word[2]=='\'')
            printf("char");
        else if(word[0]=='/' && word[1]=='*' && word[wlen-2]=='*' && word[wlen-1]=='/')
            printf("comment");
        else
            printf("normal");
        if(c==' ')
            printf(" ");
        else if(c=='\n')
            printf("\n");
    }
    return 0;
}