#include <stdio.h>
 
int main()
{
    long long int H, W, i;
 
    while(scanf("%lld %lld", &H, &W)){
        if(H==0 && W==0)
            break;
        if(H>=W && H%W==0)
            printf("%lld\n", H/W);
        else if(H<=W && W%H==0)
            printf("%lld\n", W/H);
        else if(H>W){
            for(i=1;i<=W;i++){
                if((i*H)%W==0)
                    break;
            }
            printf("%lld\n", i*H);
        }
        else{
            for(i=1;i<=H;i++){
                if((i*W)%H==0)
                    break;
            }
            printf("%lld\n", i*W);
        }
    }
    return 0;
}