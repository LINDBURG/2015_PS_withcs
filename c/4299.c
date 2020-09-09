#include <stdio.h>
 
int main()
{
    int c, t, i, j=-1;
    char line[20][99]={0};
 
    scanf("%d", &t);
    for(i=0;(c=getchar())!=EOF;i++){
        if(c=='\n'){
            j++;
            i=-1;
        }
        else{
            line[j][i]=c;
        }
    }
    if(i!=0) j++;
    if(j-t>=0){
        for(c=j-t;c<j;c++){
            for(i=0;line[c][i]!='\0';i++)
                printf("%c", line[c][i]);
            printf("\n");
        }
    }
    else{
        for(c=0;c<j;c++){
            for(i=0;line[c][i]!='\0';i++)
                printf("%c", line[c][i]);
            printf("\n");
        }
    }
    return 0;
}