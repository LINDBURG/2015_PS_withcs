#include<stdio.h>
 
char doca[1000][500], docb[1000][500];
main()
{
    int i, j, k, time, sign, a, b;
 
    scanf("%d ", &time);
    for(i=0;i<time;i++){
        scanf("%d %d ", &a, &b);
        for(j=0;j<a;j++){
            gets(doca[j]);
        }
        for(j=0;j<b;j++){
            gets(docb[j]);
        }
        for(j=0, sign=0;j<a&&j<b;j++){
            for(k=0;doca[j][k]!='\0'||docb[j][k]!='\0';k++){
                if(doca[j][k]!=docb[j][k]){
                    sign=1;
                    printf("%d\n", j+1);
                    break;
                }
            }
            if(sign==1)
                break;
        }
        if(sign!=1 &&a>b)
            printf("%d\n", b+1);
        else if(sign!=1 && a<b)
            printf("%d\n", a+1);
        else if(sign!=1)
            printf("-1\n");
    }
    return 0;
}