#include <stdio.h>
#include <limits.h>
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
void createTransposeMatrix(int a[][100],int b[][100],int n,int m){
    int k=0,l=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            b[k][l]=a[j][i];
            l++;
        }
        k++;
        l=0;
    }
    printf("ma tran sau khi chuyen vi la :\n");
    xuatmang(b,m,n);
}
void countX(int a[][100],int n,int m,int x){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(a[i][j]==x){
                printf("so x xuat hien o vi tri a[%d][%d]",i,j);
                return ;
            }
        }
    }
    printf("so x khong xuat hien trong mang");
}
void sumMaxElementsEachRow(int a[][100],int n,int m){
    int sum=0;
   int max=INT_MIN;
   for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(a[i][j]>max){
            max=a[i][j];
        }
    }
    sum+=max;
    max=INT_MIN;
   }
   printf("tong cac phan tu lon nhat trong tung hang la : %d",sum);
}


int main(){
    int a[100][100];
    int b[100][100];
    int n,m;
    nhapmang(a,n,m);
    printf("ma tran ban dau la :\n");
    xuatmang(a,n,m);
    // createTransposeMatrix(a,b,n,m);
    // int x;
    // printf("nhap x : ");
    // scanf("%d",&x);
    // countX(a,n,m,x);
    sumMaxElementsEachRow(a,n,m);
    return 0;
    
}