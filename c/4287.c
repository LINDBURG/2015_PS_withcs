#include <stdio.h>
#include <stdlib.h>
 
int main()
{
    int i, c, k,count,state=0,temp=0;
    char arr[9999]={0};
 
    for(i=0;(c=getchar())!=EOF;++i){
        arr[i]=c;
        temp++;
        if(i>0 && arr[i-1]=='-' && arr[i-2]<=arr[i] && (arr[i]>='0' && arr[i]<='9') && (arr[i-2]>='0' && arr[i-2]<='9') &&temp!=2){
            k=arr[i-2];
            temp=0;
            for(count=arr[i]-arr[i-2];count>=0;count--,k++,i++){
                arr[i-2]=k;
            }
            i-=3;
        }
        if(i>0 && arr[i-1]=='-' && arr[i-2]<=arr[i] && (arr[i]>='a' && arr[i]<='z') && (arr[i-2]>='a' && arr[i-2]<='z') &&temp!=2){
            k=arr[i-2];
            temp=0;
            for(count=arr[i]-arr[i-2];count>=0;count--,k++,i++){
                arr[i-2]=k;
            }
            i-=3;
        }
        if(i>0 && arr[i-1]=='-' && arr[i-2]<=arr[i] && (arr[i]>='A' && arr[i]<='Z') && (arr[i-2]>='A' && arr[i-2]<='Z') &&temp!=2){
            k=arr[i-2];
            temp=0;
            for(count=arr[i]-arr[i-2];count>=0;count--,k++,i++){
                arr[i-2]=k;
            }
            i-=3;
        }
    }
    arr[i--]='\0';
    for(i=0;arr[i]!='\0';i++)
        printf("%c", arr[i]);
    return 0;
}