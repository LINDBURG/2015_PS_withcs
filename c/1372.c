#include <stdio.h>
#include <string.h>
 
int main(){
 
    int i, j, m, n, count=0;
    char land[100][100];
 
    scanf("%d %d ", &n, &m);
    for(i=0;i<n;i++){
        for(j=0;j<m+1;j++){
            land[i][j]=getchar();
            if(land[i][j]=='W')
                count++;
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            if(land[i][j]=='W'){
                if(land[i][j+1]=='W'|| land[i+1][j]=='W'|| land[i+1][j+1]=='W' || land[i+1][j-1]=='W')
                    count--;
            }
        }
    }
    printf("%d", count);
    return 0;
}