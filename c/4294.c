#include<stdio.h>
 
int main()
{
    int c, i=0, j=0,t,sign, temp;
    int arr[99]={0};
 
    scanf("%d", &t);
    while((c=getchar())!=EOF){
        if(c=='+' || c=='-'){
            sign=c;
            temp=0;
            while((c=getchar())>='0' && c<='9'){
                temp=temp*10+(c-'0');
                if(sign=='-')
                    sign=0;
                else if(sign=='+')
                    sign=1;
            }
            if(sign==0)
                arr[i++]=-temp;
            else if(sign==1)
                arr[i++]=temp;
        }
    }
    for(j=0;j<t &&j<i;j++)
        printf("%d\n", arr[j]);
    return 0;
}