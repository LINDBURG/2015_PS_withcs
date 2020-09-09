#include <stdio.h>
 
main()
{
    int i;
    float dist=0,time1=0, time2=0, spd;
    char line[99];
 
    gets(line);
    time1=(line[0]-'0')*36000+(line[1]-'0')*3600+(line[3]-'0')*600+(line[4]-'0')*60+(line[6]-'0')*10+line[7]-'0';
    if(strlen(line)<=8){
        printf("%s %.2f km\n", line, dist);
    }
    else{
        for(i=9, spd=0;line[i]!='\0';i++){
            spd=spd*10+(line[i]-'0');
        }
    }
    while(gets(line)){
        time2=(line[0]-'0')*36000+(line[1]-'0')*3600+(line[3]-'0')*600+(line[4]-'0')*60+(line[6]-'0')*10+line[7]-'0';
        dist+=(time2-time1)*spd/3600;
        if(strlen(line)<=8){
            printf("%s %.2f km\n", line, dist);
        }
        else{
            for(i=9, spd=0;line[i]!='\0';i++){
                spd=spd*10+(line[i]-'0');
            }
        }
        time1=time2;
    }
    return 0;
}