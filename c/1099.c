#include <stdio.h>
 
main()
{
    int time, a, b, i;
 
    scanf("%d", &time);
    for(i=0;i<time;i++){
        scanf("%d %d", &a, &b);
        if(a-b>=0 && b>=0 && (a+b)%2==0 && (a-b)%2==0)
            printf("%d %d\n", (a+b)/2, (a-b)/2);
        else
            printf("impossible\n");
    }
}