#include <stdio.h>
#include <stdlib.h>
 
int main()
{int c, all[10000]={0}, len=0,i,start=0,lim;
while(1){
 
    c=getchar();
 
    if(c!='\n' && c!=EOF){
        all[len]=c;
        ++len;
        }
 
    else{
        lim=len;
        while(lim>20){
            if(all[start+18]==' ' || all[start+19]==' ' || all[start+20]==' '){
                for(i=2;i>=0;i--){
                    if(all[start+i+18]==' ')
                    {all[start+i+18]='\n';
                    break;}
                    }
                lim=lim-(i+19);
                start=start+19+i;
 
            }
            else{
                for(i=len;i>=start+19;i=i-1)
                    all[i+2]=all[i];
                len=len+2;
                all[start+19]='-';
                all[start+20]='\n';
                lim=lim-20;
                start=start+21;
 
            }
        }
 
    for(i=0;i<len;++i)
        printf("%c",all[i]);
    printf("\n\n");
    len=0;
    start=0;
    }
if(c==EOF)
        break;
 
}
    return 0;
}