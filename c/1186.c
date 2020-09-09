#include <stdio.h>
 
int a [1000000], b [1000000];
int main()
{
    int N , M , i , j, k=0, count;
 
    while(scanf ("%d %d", &N, &M)){
        if(N==0&& M==0)
            break;
        for (i=0;i <N;i++){
            scanf ("%d", &a [i]);
        }
        for (i=0;i <M;i++){
            scanf ("%d", &b [i]);
        }
        for (i=0, j=0, count=0;i <N&& j<M;){
            if (a [i]==b [j]){
                count++;
                i++;
                j++;
            }
            else if(a[i]>b[j])
                j++;
            else if(a[i]<b[j])
                i++;
        }
        printf ("%d\n", count);
    }
    return 0;
}