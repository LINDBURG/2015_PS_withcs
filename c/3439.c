#include <stdio.h>
 
int main()
{
    int i, j, num, count, time;
    char arr[999]={0};
 
    while(scanf("%d", &time)){
        if(time==0)
            break;
        for(i=0;time>0;i++){
            scanf("%d", &arr[i]);
            if(i%6==5)
                time--;
        }
        for(num=1, count=0;num<50;num++){
            for(j=0;j<i-1;j++){
                if(arr[j]==num){
                    count++;
                    break;
                }
            }
        }
        if(count==49)
            printf("Yes\n");
        else
            printf("No\n");
    }
    return 0;
}