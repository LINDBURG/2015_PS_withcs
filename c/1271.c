#include <stdio.h>
 
main()
{
    long long  p, q, n, temp;
    int max, count;
 
    while(scanf("%lld %lld", &p, &q)!=EOF){
        if(p<=q){
            for(max=1, temp=p;temp<=q;temp++){
                for(count=1, n=temp;n!=1;count++){
                    if(n%2==1)
                        n=3*n+1;
                    else
                        n/=2;
                }
                if(count>max)
                    max=count;
            }
        }
        else{
            for(max=1, temp=q;temp<=p;temp++){
                for(count=1, n=temp;n!=1;count++){
                    if(n%2==1)
                        n=3*n+1;
                    else
                        n/=2;
                }
                if(count>max)
                    max=count;
            }
        }
        printf("%lld %lld %d\n", p, q, max);
    }
    return 0;
}