#include <stdio.h>
#include <limits.h>
int main(){
    int a,b,c,d;
    scanf("%d%d%d%d",&a,&b,&c,&d);
    
    int max=a;
    if(b>max){
        max=b;
    }
    if(c>max){
        max=c;
    }
    if(d>max){
        max=d;
    }
    int min=a;
    if(b<min){
        min=b;
    }
    if(c<min){
        min=c;
    }
    if(d<min){
        min=d;
    }
    printf("max=%d,min=%d",max,min);
    return 0;
}