#include<stdio.h>
 
main()
{
    int time, stnum, temp,j, i, c, k;
    int score[99][1000];
    float aver, sum, count;
 
    scanf("%d ", &time);
    for(j=0;j<time;j++){
        scanf("%d", &c);
        for(i=0, sum=0;i<c;i++){
            scanf("%d", &score[j][i]);
            sum+=score[j][i];
        }
        aver=sum/c;
        for(i=0, count=0;i<c;i++){
            if(score[j][i]>aver)
                count++;
        }
        printf("%.3f%%\n", 100*count/c);
    }
    return 0;
}