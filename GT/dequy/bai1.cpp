#include<stdio.h>

int F1(int n,int m){
    if(n==0) return m;
    return F1(n-1,n*m);
}
int F1_khu(int n,int m){

    for(int i=n;i>0;i--){
       
        m=m*i;
    }
    return m;
}

int main(){
 int n,m;
 printf("nhap n:");scanf("%d",&n);
 printf("nhap m:");scanf("%d",&m);
 printf("ket qua:%d",F1_khu(n,m));
}