#include <stdio.h>
 
int main()
{
    int t, max, min, i, num;
 
    scanf("%d", &t);
    for(i=0;i<t;i++){
        scanf("%d", &num);
        if(num%2==1)
            printf("0 0\n");
        else{
            max=num/2;
            min=num/4;
            if(num%4==2)
                min++;
            printf("%d %d\n", min, max);
        }
    }
    return 0;
}