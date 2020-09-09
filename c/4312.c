#include<stdio.h>
 
main()
{
    int i, j, k, sum, count=0, temp, sign;
    char line[1000];
    int canum[1000]={0};
 
    for(j=0, k=0;gets(line);j++){
        for(i=0, sum=0, temp=0;line[i]!='\0';i++){
            if(line[i]==' '){
                sum+=temp;
                temp=0;
            }
            else{
                temp=temp*10+(line[i]-'0');
            }
        }
        for(i=0, sign=0;i<k;i++){
            if(canum[i]==temp+sum)
                sign=1;
        }
        if(sign==0)
            canum[k++]=temp+sum;
    }
    printf("%d",k);
    return 0;
}