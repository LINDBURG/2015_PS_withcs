#include <stdio.h>
 
int trim(char line[]);
int getline(char lime[], int maxline);
 
main()
{
    char line[20000];
    char lime[20000];
 
    while (getline(lime, 20000)>0){
        trim(lime);
        printf("%s\n", lime);
    }
    return 0;
}
 
int trim(char s[])
{
    int n;
 
    for (n=strlen(s)-1; n>=0; n--)
        if (s[n]!='\n' && s[n]!=' ' && s[n]!='\t' && s[n]!='\r')
            break;
    s[n+1]='\0';
    return n;
}
 
int getline (char s[], int lim)
{
    int c,i;
 
    for (i=0;i<lim-1 && (c=getchar())!=EOF && c!='\n'; ++i)
        s[i] =c;
    if (c=='\n'){
        s[i]=c;
        ++i;
    }
    s[i]='\0';
    return i;
}