#include <stdio.h>
#include <math.h>
void nhapmang(int a[],int &n){
    do{
    printf("nhap so luong phan tu n la :");
    scanf("%d",&n);
    if(n<=0 || n>10){
        printf("\nnhap lai !");
    }
    }while(n<=0 || n>10);
    for(int i=0;i<n;i++){
        printf("nhap [%d]:",i+1);\
        scanf("%d",&a[i]);
    }
}
void xuatmang(int a[], int n){
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}
int isprime(int n){
    if(n<2)
    return 0;
  for(int i=2;i<=sqrt(n);i++){
    if(n%i==0){
        return 0;
    }
  }
  return 1;
}
void insont(int a[],int n){
    int count=0;
    for(int i=0;i<n;i++){
        if(isprime(a[i])){
            printf("%d ",a[i]);
            count++;
        }
    }
    if(count==0){
        printf("\nmang khong co so nguyen to");
    }
}

int main(){
    int n;
    int a[100];
    nhapmang(a,n);
    xuatmang(a,n);
    printf("\nmang so nguyen to la :");
    insont(a,n);
    return 0;
}