#include <stdio.h>
int main(void)
{
     int c;
 
     while((c=getchar())!=EOF){
        if(c>=0 && c<=127){
            printf("%c", c);
        }
        else{
            printf("%02X ", c);
        }
     }
     return 0;
}