#include<stdio.h>
 
main()
{
    int i, A, B, C, num, time;
 
    scanf("%d", &time);
    for(i=0;i<time;i++){
        scanf("%d", &num);
        if(num<6)
            printf("NULL\n");
        else{
            for(A=1, B=2, C=3;A+B+C<=num;A++){
                B=A+1;
                C=B+1;
                for(;A+B+C<=num;B++){
                    C=B+1;
                    for(;A+B+C<=num;C++){
                        if(A+B+C==num)
                            printf("%d %d %d\n", A, B, C);
                    }
                    C=B+1;
                }
                B=A+1;
            }
        }
    }
    return 0;
}
