#include <stdio.h>
#include <math.h>
int main(){
    int a,b,c;
    printf("nhap a b c = ");
    scanf("%d %d %d",&a,&b,&c);
    if(a==0 && b==0){
        if(c==0){
            printf("pt vo so nghiem");
        }else{
            printf("pt vo nghhiem");
        }
    }else if(a==0 && b!=0){
            float x =1.0*(-c)/b;
            printf("pt co mot nghiem duy nhat x=%.2f",x);
    }else{
        int deta=b*b-4*a*c;
        if(deta<0){
            printf("pt vo nghiem");
        }else if(deta==0){
            float x=1.0*(-b)/2*a;
            printf("pt co mot nghiem duy nhat x=%.2f",x);
        }else{
            float x1=1.0*(b*b- sqrt(deta))/(2*a);
            float x2=1.0*(b*b+ sqrt(deta))/(2*a);
            printf("pt co hai nghiem phan biet \n");
            printf("x1 = %.2f \n",x1);
            printf("x2 = %.2f \n",x2);
        }
    }
    return 0;
}