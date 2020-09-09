#include<stdio.h>
 
int main()
{
    int i, c, t,k , max, temp;
    char arr[99]={0};
 
    while((c=getchar())!=EOF){
        arr[0]=c;
        for(i=1;(c=getchar())!=EOF && c!='\n';i++)
            arr[i]=c;
        arr[i]='\0';
        for(i=0;arr[i]!='\0';i++){
            for(t=i, max=i;arr[t]!='\0';t++){
                if(arr[max]>='A' && arr[max]<='Z')
                    k=arr[max]+32;
                if(arr[max]>='a' && arr[max]<='z' || arr[max]==' '|| arr[max]=='\t')
                    k=arr[max];
                if(arr[t]>='A' && arr[t]<='Z')
                    c=arr[t]+32;
                if(arr[t]>='a' && arr[t]<='z' ||arr[max]==' '||arr[max]=='\t')
                    c=arr[t];
                if(k<c)
                    max=t;
                if(k==c){
                    if(arr[max]<arr[t])
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