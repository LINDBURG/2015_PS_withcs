#include <stdio.h>
#include <stdlib.h>
 
void main()
{
    int n,i, j;
    char a[1000]={0}, b[1000]={0}, c[1000]={0};
 
    scanf("%d", &n);
    for(j=0;j<1000;j++){
        c[j]=0;
        a[j]=-1;
    }
    a[0]=b[0]=1;
    if(n==1 || n==2)
        j=1;
    for(i=0;i<n-2;i++){
        for(j=0;a[j]!=-1;j++){
            c[j]=a[j]+b[j];
            a[j]=b[j];
            b[j]=c[j];
            c[j]=0;
            if(b[j]>9){
                if(a[j+1]==-1)
                    a[j+1]=1;
                else
                    a[j+1]++;
                b[j]%=10;
            }
        }
    }
    for(;j>0;j--)
        printf("%d", b[j-1]);
    return 0;
}