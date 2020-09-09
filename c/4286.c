#include <stdio.h>
 
int main()
{
    int i, c, t, j, k,result, rest, count;
    char arr[9999]={0};
 
    scanf("%d %d" , &i, &c);
    for(;i>0;i--){
        scanf("%d", &t);
        result=t;
        rest=t;
        for(j=1,count=0;result>=j;){
            j=c*j;
            count++;
        }
        j/=c;
        for(k=0;count>0;count--,k++){
            if((result/j)>=0 && (result/j)<=9 &&rest>=j)
                arr[k]=(result/j)+'0';
            else if(result/j>9 && rest>=j)
                arr[k]=result/j+'A'-10;
            else
                arr[k]='0';
            rest=result%j;
            result=result/j;
            j=j/c;
            result=rest;
        }
        arr[k]='\0';
        if(t==0){
            arr[0]='0';
            arr[1]='\0';
        }
        printf("%s\n",arr);
    }
    return 0;
}