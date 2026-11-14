#include <stdio.h>
int main(){
    // giờ =a,phút =b, giây =c,thêm giây =ss
    int a,b,c,ss;
    printf("nhap gio pht giay la:");
    scanf("%d%d%d",&a,&b,&c);
    printf("\nthem giay");
    scanf("%d",&ss);
    c=c+ss;
    if(c>=60){
        b=b+c/60;
        c=c%60;
    }
    if(b>=60){
        a=a+b/60;
        b=b%60;
    }
    printf("\n%d gio %d phut %d giay",a,b,c);
    return 0;
    
}