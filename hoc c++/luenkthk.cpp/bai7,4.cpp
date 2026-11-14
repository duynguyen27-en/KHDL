#include <stdio.h>
void nhapmang(int a[],int b[],int &n,int &m){
    printf("nhap so luong phan tu n :");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
       
        printf("a[%d] =",i+1);
        scanf("%d",&a[i]);
    }
    printf("nhap so luong phan tu m :");
    scanf("%d",&m);
    for(int i=0;i<m;i++){
        
        printf("b[%d] =",i+1);
        scanf("%d",&b[i]);
       
    }   
}
void xuatmang(int a[],int b[],int n,int m){
    printf("\nphan tu mang a la :");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    printf("\nphan tu mang b la :");
    for(int i=0;i<m;i++){
        printf("%d ",b[i]);
    }
}
void xuatmang1(int a[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}
void sxgiam(int a[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]<a[j]){
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    xuatmang1(a,n);
}
void mangc(int a[],int b[],int c[],int n,int m){
    int i=0;
    int j=0;
    int k=0;
    while(i<n && j<m ){
        if(a[i]>b[j]){
            c[k]=a[i];
            k++;
            i++;
        }else{
            c[k]=b[j];
            k++;
            j++;
        }
    }
    while(i<n){
        c[k]=a[i];
        k++;
        i++;
    }
    while(j<m){
        c[k]=b[j];
        k++;
        j++;
    }
    printf("\nphan tu mang c la :");
    xuatmang1(c,k);
}
int main(){
    int a[100],b[100],c[100];
    int n,m;
    nhapmang(a,b,n,m);
    xuatmang(a,b,n,m);
    printf("\nmang a sau khi sap xep la :");
    sxgiam(a,n);
    printf("\nmang b sau khi sap xep la :");
    sxgiam(b,m);
    mangc(a,b,c,n,m);
    return 0;
}