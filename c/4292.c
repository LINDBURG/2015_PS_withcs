#include <stdio.h>
#include <math.h>
#define PI 3.14159265
 
int main()
{
    int c, i, t, temp1;
    double arr[99], temp;
    char line[99]={0};
 
    for(t=0;(c=getchar())!=EOF;t++){
        temp=0;
        temp1=0;
        for(i=0;i<99;i++)
            line[i]='\0';
        line[0]=c;
        for(i=1;(c=getchar())!='\n'&& c!=EOF;i++)
            line[i]=c;
        for(i=4;line[i]>='0' && line[i]<='9';i++){
            temp=temp*10+(line[i]-'0');
        }
        i++;
        for(;line[i]!='\0';i++){
            temp1=temp1*10+(line[i]-'0');
        }
        if(line[0]=='s' && line[1]=='i' && line[2]=='n'){
            arr[t]=sin((temp/180)*PI);
        }
        else if(line[0]=='p' && line[1]=='o' && line[2]=='w'){
            arr[t]=pow(temp, temp1);
        }
        else if(line[0]=='e' && line[1]=='x' && line[2]=='p'){
            arr[t]=exp(temp);
        }
    }
    for(i=0;i<t;i++)
        printf("%.6f\n", arr[i]);
    return 0;
}