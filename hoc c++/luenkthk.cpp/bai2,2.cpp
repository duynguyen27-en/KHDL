#include <stdio.h>
int main(){
    int a,b;
    printf("nhap a va b :");
    scanf("%d %d",&a,&b);
    if(a==0){
        if(b==0){
            printf("pt vo so nghiem");
        }else{
            printf("pt vo nghiem");
        }
    }else{
        float x=1.0*(-b)/a;
        printf("pt trinh co nghiem duy nhat x=%.2f",x);
    }
    return 0;
}