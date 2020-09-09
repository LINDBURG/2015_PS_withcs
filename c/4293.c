#include <stdio.h>
#include <stdlib.h>
 
int main()
{
    int c, i=0, t=0, n=0, temp=0;
    double save[200];
    int alpha[30];
 
    for(t=0;t<26;t++){
        n=getchar()-'a';
        getchar();
        for(temp=0;(c=getchar())!='\n';){
            temp=temp*10+(c-'0');
        }
        alpha[n]=temp;
    }
    for(t=0;(c=getchar())!='\n'&& c!=EOF;t++){
        if(c>='a' && c<='z'){
            save[i]=alpha[c-'a'];
            i++;
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
        }
    }
    printf("%.6f", save[0]);
    return 0;
}