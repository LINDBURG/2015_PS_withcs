#include <stdio.h>
#define MAXLINE 1000
 
int getline(char line[], int maxline);
void copy(char to[], char from[]);
 
main()
{
    int len,i;
    char line[MAXLINE];
    char arr[MAXLINE];
 
    i=0;
    while ((len=getline(line, MAXLINE))>0){
        if (len<32){
            copy (arr, line);
            printf("%s",arr);
        }
    }
    return 0;
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
 
void copy(char to[], char from[])
{
    int i;
 
    i=0;
    while ((to[i]=from[i])!='\0')
        ++i;
}
 