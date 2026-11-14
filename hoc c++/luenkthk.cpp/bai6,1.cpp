#include <stdio.h>
#include <limits.h>
#include <math.h>
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
void findMaxValue(int a[],int n){
     int max=INT_MIN;
     for(int i=0;i<n;i++)
    {
        if(a[i]>max){
            max=a[i];
        }
    }
    printf("\nmax=%d",max);
}
void sumSquaresOfNegativeNumbers(int a[],int n){
    int sum=0;
    for(int i=0;i<n;i++){
        if(a[i]<0){
            sum+=pow(a[i],2);
        }
    }
    printf("\nsum=%d",sum);
}
void sortAscending(int a[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    printf("\nmang sau sap xep la :\n");
    xuatmang(a,n);
}
// void containsX(int a[],int n,int x){
//     for(int i=0;i<n;i++){
//         if(a[i]==x){
//             printf("gia tri x xuat hien o vi tri %d\n",i);
//             return;
//         }
//     }
//     printf("gia tri x khong xuat hien\n");
// }
void containsX2(int a[],int n, int x){
    int left=0;
    int right=n-1;
    while(left<=right){
        int mid=(left+right)/2;
        if(a[mid]==x){
            printf("gia tri x xuat hien o vi tri %d\n",mid);
            return;
        }else if(x>a[mid]){
            left=mid+1;
        }else if(x<a[mid]){
          right=mid-1;
        }
    }
     printf("gia tri x khong xuat hien\n");
} 


int main(){
    int a[100];
    int n;
    nhapmang(a,n);
    xuatmang(a,n);
    findMaxValue(a,n);
    sumSquaresOfNegativeNumbers(a,n);
    sortAscending(a,n);
    int x;
    printf("\nnhap x : ");
    scanf("%d",&x);
    // containsX(a,n,x);
    containsX2(a,n,x);
    return 0;

}