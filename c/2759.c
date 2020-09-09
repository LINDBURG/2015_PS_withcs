#include <stdio.h>
 
int main()
{
    int i, j, count, a ,b, c;
    char A[99], B[99], C[99];
 
    scanf("%d ", &count);
    for(i=1;i<=count;i++){
        for(j=0;j<99;j++)
            C[j]=0;
        for(a=0;(c=getchar())!=' ';a++){
            A[a]=c-'0';
        }
        A[a--]='\0';
        for(b=0;(c=getchar())!='\n' && c!=EOF;b++){
            B[b]=c-'0';
        }
        B[b--]='\0';
        if(a>b){
            for(j=0;b>=0;a--, b--, j++){
                C[j]+=A[a]+B[b];
                if(C[j]==2){
                    C[j+1]=1;
                    C[j]=0;
                }
                else if(C[j]==3){
                    C[j+1]=1;
                    C[j]=1;
                }
            }
            for(;a>=0;a--, j++){
                C[j]+=A[a];
                if(C[j]==2){
                    C[j+1]=1;
                    C[j]=0;
                }
                else if(C[j]==3){
                    C[j+1]=1;
                    C[j]=1;
                }
            }
        }
        else if(a==b){
            for(j=0;a>=0;a--, j++){
                C[j]+=A[a]+B[a];
                if(C[j]==2){
                    C[j+1]=1;
                    C[j]=0;
                }
                else if(C[j]==3){
                    C[j+1]=1;
                    C[j]=1;
                }
            }
        }
        else{
            for(j=0;a>=0;a--, b--, j++){
                C[j]+=A[a]+B[b];
                if(C[j]==2){
                    C[j+1]=1;
                    C[j]=0;
                }
                else if(C[j]==3){
                    C[j+1]=1;
                    C[j]=1;
                }
            }
            for(;b>=0;b--, j++){
                C[j]+=B[b];
                if(C[j]==2){
                    C[j+1]=1;
                    C[j]=0;
                }
                else if(C[j]==3){
                    C[j+1]=1;
                    C[j]=1;
                }
            }
        }
        if(C[j]==0)
            j--;
        printf("%d ", i);
        for(;j>=0;j--)
            printf("%d", C[j]);
        printf("\n");
    }
    return 0;
}