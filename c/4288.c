#include <stdio.h>
 
double atof(char s[]);
int main()
{
    int c,i, sign, n, f;
    double k;
    char arr[99]={0};
 
    scanf("%d ", &c);
    for(;c>0;c--){
        sign=0;
        gets(arr);
        k=atof(arr);
        for(i=0;arr[i]!='e' && arr[i]!='E';i++)
            ;
        if(arr[++i]=='-')
            sign=1;
        ++i;
        for(n=0;arr[i]>='0' && arr[i]<='9';i++){
            n=n*10+(arr[i]-'0');
        }
        for(i=0,f=1;i<n;i++)
            f*=10;
        if(sign==1){
            k=k/f;
        }
        if(sign==0){
            k=k*f;
        }
        printf("%.9g\n", k);
    }
}
 
double atof(char s[])
{
    double val, power;
    int i , sign;
 
    for(i=0; isspace(s[i]);i++)
        ;
    sign=(s[i]== '-') ? -1:1;
    if(s[i]=='+' || s[i]=='-')
        i++;
    for(val =0.0; isdigit(s[i]); i++)
        val=10.0*val+(s[i]-'0');
    if(s[i]=='.')
        i++;
    for(power=1.0; isdigit(s[i]); i++){
        val=10.0*val + (s[i]-'0');
        power *=10.0;
    }
    return sign * val/power;
}