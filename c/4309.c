#include <stdio.h>
 
char arr[999];
int main()
{
    int c, i, d, j, count, sign;
    double val, power;
 
    while(gets(arr)){
        if(arr[0]=='"'){
            for(j=1;arr[j]!='"';j++)
                ;
            j++;
            for(i=1;arr[i]!='"';i++){
                if(arr[i]!='%')
                    printf("%c", arr[i]);
                else{
                    i++;
                    if(arr[i]=='s'){
                        for(j++;arr[j]!=' ' && arr[j]!='\0';j++)
                            printf("%c", arr[j]);
                    }
                    else if(arr[i]=='d'){
                        for(j++, d=0;arr[j]!=' ' && arr[j]!='\0';j++){
                            d=d*10+(arr[j]-'0');
                        }
                        printf("%d", d);
                    }
                    else if(arr[i]=='f'){
                        for(j++, val=0.0;arr[j]!='.';j++){
                            val=val*10.0+(arr[j]-'0');
                        }
                        for(j++, power=1.0;arr[j]!=' ' && arr[j]!='\0';j++){
                            val=10.0*val+(arr[j]-'0');
                            power*=10.0;
                        }
                        printf("%f", val/power);
                    }
                    else if(arr[i]=='x'){
                        for(j++, d=0;arr[j]!=' ' && arr[j]!='\0';j++)
                            printf("%x", arr[j]);
                    }
                    else if(arr[i]=='X'){
                        for(j++, d=0;arr[j]!=' ' && arr[j]!='\0';j++)
                            printf("%X", arr[j]);
                    }
                    else if(arr[i]=='o'){
                        for(j++, d=0;arr[j]!=' ' && arr[j]!='\0';j++){
                            d=d*10+(arr[j]-'0');
                        }
                        printf("%o", d);
                    }
                    else if(arr[i]=='c'){
                        for(j++, d=0;arr[j]!=' ' && arr[j]!='\0';j++){
                            d=d*10+(arr[j]-'0');
                        }
                        printf("%c", d);
                    }
                    else if(arr[i]=='e'){
                        for(j++, val=0.0;arr[j]!='.';j++){
                            val=val*10.0+(arr[j]-'0');
                        }
                        for(j++, power=1.0;arr[j]!=' ' && arr[j]!='\0';j++){
                            val=10.0*val+(arr[j]-'0');
                            power*=10.0;
                        }
                        printf("%e", val/power);
                    }
                    else if(arr[i]=='u'){
                        for(j++;arr[j]!=' ' && arr[j]!='\0';j++){
                            if(arr[j]=='-')
                                j++;
                            printf("%c", arr[j]);
                        }
                    }
                }
            }
            printf("\n");
        }
        for(i=0;i<99;i++)
            arr[i]='\0';
    }
    return 0;
}