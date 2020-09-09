#include <stdio.h>
 
int main()
{
    int c, i, t, n, sum;
    char save[99]={0}, type[10], line[99];
 
    scanf("%s", &save);
    i=strlen(save);
    while((scanf("%s %d %s", &type, &n, &line))!=EOF){
        if(type[5]=='p'&&type[6]=='y'){
            for(t=0;t<strlen(line)&& t<n;t++){
                save[t]=line[t];
            }
            if(strlen(line)>i)
                i=strlen(line);
        }
        if(type[5]=='a'&&type[6]=='t'){
            for(t=0;t<strlen(line) && t<n;t++, i++)
                save[i]=line[t];
        }
        if(type[5]=='m'&&type[6]=='p'){
            for(t=0, sum=0;t<strlen(line)&&t<n;t++){
                if(save[t]>line[t]){
                    sum=1;
                    break;
                }
                else if(save[t]<line[t]){
                    sum--;
                    break;
                }
            }
            printf("%d\n", sum);
        }
    }
    return 0;
}