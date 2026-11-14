#include <stdio.h>
void timmax(int x,int y){
    int max;
    if(x>y){
        max=x;
        printf("max=%d",max);
    }else{
        max=y;
        printf("max=%d",max);
    }
}
int main(){
    int x,y;
    scanf("%d%d",&x,&y);
    timmax(x,y);
    return 0;
}