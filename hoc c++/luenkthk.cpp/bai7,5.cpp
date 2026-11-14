#include <stdio.h>
void nhapmang(int a[][100],int &n,int &m){
    printf("nhap so hang va co la :");
    scanf("%d%d",&n,&m);
   for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        printf("a[%d][%d] =",i,j);
        scanf("%d",&a[i][j]);
    }
   }    
}
void xuatmang(int a[][100],int n,int m){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
}
void sumMatrices(int a[][100],int b[][100],int c[][100],int n,int m){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    printf("\nphan tu mang c la :\n");
    xuatmang(c,n,m);
}

int main(){
    int a[100][100],b[100][100],c[100][100];
    int n,m;
    printf("nhap ma tran a la \n");
    nhapmang(a,n,m);
    printf("nhap ma tran b la \n");
    nhapmang(b,n,m);
    xuatmang(a,n,m);
    xuatmang(b,n,m);
    sumMatrices(a,b,c,n,m);
    return 0;   
}