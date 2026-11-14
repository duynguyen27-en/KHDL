#include <stdio.h>
int main(){
    int a,b;
    printf("nhap a va b la :");
    scanf("%d %d",&a,&b);
    int x=a;
    int y=b;
    // tim uscln
    int temp;
    if(a<b){
        temp=a;
        a=b;
        b=temp;
    }
    while(b!=0){
        int r=a%b;
        a=b;
        b=r;
    }
    printf("uscln=%d",a);
    // tim bscnn
    printf("\nbscnn=%d",(x*y)/a);
    return 0;
    }