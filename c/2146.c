#include <stdio.h>
 
int main()
{
    float i, len, result;
 
    for(;scanf("%f", &len);){
        if(len==0)
            break;
        for(result=2, i=0;i<len;result++){
            i+=(1/result);
        }
        printf("%g card(s)\n", result-2);
    }
    return 0;
}