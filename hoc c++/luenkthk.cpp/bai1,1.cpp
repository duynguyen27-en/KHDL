#include <stdio.h>
#include <math.h>
int main(){
    int a,b,c;
    printf("nhap do dai 3 canh cua mot tam giac la :");
    scanf("%d %d %d",&a,&b,&c);
    float p=(a+b+c)*(1.0/2.0);
    float s=sqrt(p*(p-a)*(p-b)*(p-c));
    printf("chu vi la :%.2f",p);
    printf("\ndien tich la :%.2f",s);
    return 0;

}