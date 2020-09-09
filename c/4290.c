#include <stdio.h>
#include <stdlib.h>
 
int main()
{
    int c, i=0, t=0, n=0;
    int save[200];
    char nothing[200];
 
    for(t=0;(c=getchar())!='\n'&& c!=EOF;t++){
        nothing[t]=c;
        if(t>0 && c==' ' && (nothing[t-1]>='0' && nothing[t-1]<='9')){
            save[i]=n;
            n=0;
            i++;
        }
        else if(c>='0' && c<='9'){
            n=n*10+(c-'0');
        }
        else if(c=='+'||c=='-'||c=='/'||c=='*'||c=='%'){
            i--;
            if(c=='+')
                save[i-1]=save[i-1]+save[i];
            else if(c=='-')
                save[i-1]=save[i-1]-save[i];
            else if(c=='*')
                save[i-1]=save[i-1]*save[i];
            else if(c=='/')
                save[i-1]=save[i-1]/save[i];
            else if(c=='%')
                save[i-1]=save[i-1]%save[i];
        }
    }
    printf("%d",save[0]);
    return 0;
}
