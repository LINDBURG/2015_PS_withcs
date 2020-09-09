#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
int main()
{int mode=0, counter=0, n, add,i=0, bool_1, type;
char a[99999];
 
 
for(scanf("%d ", &n);n>0; n--){
    gets(a);
    counter=0;
 
for(i=0;i<strlen(a);++i){
    if(a[i]=='(' || a[i] == ')')
        mode=1;
    if(a[i]=='{' || a[i] == '}')
        mode=2;
    if(a[i]=='[' || a[i] == ']')
        mode=3;
 
    if(counter==0)
        type=mode;
    if(mode==type)
        bool_1=1;
    else
        bool_1=0;
 
 
    if(bool_1==1){
 
        if(a[i]=='(' || a[i] == '{' || a[i] == '[')
            add=1;
        if(a[i]==')' || a[i] == '}' || a[i] == ']')
            add=-1;
        counter=counter+add;
        add=0;
        if(counter==0)
            mode=0;
        if(counter<0)
            mode=-1;
 
    }
    else
        mode=-1;
 
    if(a[i]== EOF)
        break;
    if (mode<0)
        break;
    if(i==strlen(a)){
        counter=0;
        }
 
}
if(mode==0)
        printf("Y\n");
    else
        printf("N\n");
}
 
return 0;
}