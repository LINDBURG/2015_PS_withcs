#include <stdio.h>
 
int main()
{
    int i, j, num, temp, count;
 
    for(count=1;scanf("%d", &num);count++){
        if(num==0)
            break;
        printf("%d. ", count);
        temp=3*num;
        if(temp%2==1){
            printf("odd ");
            temp=(3*(temp+1)/2)/9;
            printf("%d\n", temp);
        }
        else{
            printf("even ");
            temp=(3*(temp/2))/9;
            printf("%d\n", temp);
        }
    }
    return 0;
}