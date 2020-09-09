#include<stdio.h>
 
int main()
{
    int i, c, t, max, temp;
    char arr[99]={0};
 
    while((c=getchar())!=EOF){
        arr[0]=c;
        for(i=1;(c=getchar())!=EOF && c!='\n';i++)
            arr[i]=c;
        arr[i]='\0';
        for(i=0;arr[i]!='\0';i++){
            for(t=i, max=i;arr[t]!='\0';t++){
                if(arr[max]<arr[t]){
                    max=t;
                }
            }
            temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        printf("%s\n", arr);
    }
    return 0;
}