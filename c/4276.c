#include <stdio.h>
#include <string.h>
 
int main()
{
    int n, c, pos=0, sum, ins, state=0;
    int i, j, k, m;
    char arr[200];
 
    scanf("%d",&n);
 
    for(i=0; i<n; i++)
    {
        memset(arr, 0, 200);
        scanf("%s", arr);
        pos = strlen(arr);
 
        if(arr[0]=='0' && (arr[1]=='X' || arr[1]=='x'))
        {
            m=1;
            sum=0;
            state=0;
            for(k=pos-1;k>1;--k)
            {
                if(arr[k]>='0' && arr[k]<='9')
                    ins=(arr[k]-'0')*m;
                else if(arr[k]=='a' || arr[k]=='A')
                    ins=10*m;
                else if(arr[k]=='b' || arr[k]=='B')
                    ins=11*m;
                else if(arr[k]=='c' || arr[k]=='C')
                    ins=12*m;
                else if(arr[k]=='d' || arr[k]=='D')
                    ins=13*m;
                else if(arr[k]=='e' || arr[k]=='E')
                    ins=14*m;
                else if(arr[k]=='f' || arr[k]=='F')
                    ins=15*m;
                else
                {
                    state=1;
                    break;
                }
 
                sum=sum+ins;
                m*=16;
            }
            if(state == 1)
                printf("null\n");
            else
                printf("%d\n",sum);
 
 
        }
        else
            printf("null\n");
    }
    return 0;
}
 