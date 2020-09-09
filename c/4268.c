#include <stdio.h>
#include <stdlib.h>
 
int main()
{
    int c, count=0,space=0,len=0,m=0, n=0, condition=0, start, newline=0, newtab=0;
    char fir[5000]={0}, sec[4]={0};
     
    while((c=getchar())!=EOF){
        if(c!='\t'){
            fir[len]=c;
            ++len;
            if(c=='\n')
                count=0;
            else
                ++count;
          }
        else {
            for(space=(4-(count%4));space>0;space=space-1)
                {fir[len]=' ';
                ++len;}
            count=0;
        }
    }
    while(1){
        condition=0;
     
        for(m=0;m<4;++m){
            sec[m]=fir[m+start];
            if(sec[m]=='\n'){
                newline=m;
                condition=1;
                break;
            }
            else if(sec[m]==0){
                condition=-1;
                break;
            }
        }
        if(condition==0){
            if(sec[3]==' '){
                newtab =3;
                for(n=3;n>=0;n=n-1){
                    if(sec[n]==' ')
                        newtab=n;
                    else
                        break;
                }
                for(n=0;n<newtab;++n)
                    printf("%c",sec[n]);
                printf("\t");
     
            }
            else{
                printf("%s",sec);
                }
            start=start+4;
            condition=0;
        }
        else
            printf("%s", sec);
        if(condition==1){
            start=start+newline+1;
            newline=0;
            condition=0;
        }
        if(condition==-1)
            break;
        for(n=0;n<5;++n)
                sec[n]=0;
    }
    return 0;
}