#include <stdio.h>
void nhapmang(int a[],int &n){
    printf("nhap so luong phan tu :");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("a[%d] =",i+1);
        scanf("%d",&a[i]);
    }
}
void xuatmang(int a[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}
void sortDescending(int a[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]<a[j]){
                int temp= a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    printf("\nmang sau sap xep giam dan la :");
    xuatmang(a,n);
}
void chenx(int a[],int n,int x){
    int vt=0;
    for(int i=0;i<n;i++){
        if(x>a[i]){
        vt=i;
        int j;
        for( j=n-1;j>=vt;j--){
            a[j+1]=a[j];
        }
        a[vt]=x;
        n++;
        break;
        }
    }
    printf("\nmang sau khi chen x la :");
    xuatmang(a,n);

}

int main(){
    int a[100];
    int n;
    nhapmang(a,n);
    xuatmang(a,n);
    sortDescending(a,n);
    int x;
    printf("\nnhap x :");
    scanf("%d",&x);
    chenx(a,n,x);
    return 0;   
}