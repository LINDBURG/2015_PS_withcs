#include <stdio.h>
 
int main()
{
    int i, j, result=0;
    char arr[999]={0};
 
    gets(arr);
    for(i=0;arr[i]!=' ';i++)
        ;
    for(i++;arr[i]!='\0';i++){
        for(j=0;arr[j]!=' ';j++){
            result+=(arr[j]-'0')*(arr[i]-'0');
        }
    }
    printf("%d", result);
    return 0;
}