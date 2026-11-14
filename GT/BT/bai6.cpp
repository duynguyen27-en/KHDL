#include<stdio.h>

void TaoMang(int a[],int &n){
    printf("nhap N:");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("a[%d]= ",i);
        scanf("%d",&a[i]);
    }
}

void XuatMang(int a[],int n){
    printf("\nMang:");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}

int pt(int a[],int L,int R){
   
   int pivot=a[R];
   int i=L-1;
   for(int j=L;j<R;j++){
    if(a[j]<=pivot){
        ++i;
        int tam=a[i];
        a[i]=a[j];
        a[j]=tam;
    }
   }
   ++i;
   int tam=a[i];
   a[i]=a[R];
   a[R]=tam;
   return i;
}

void QUICKSORT(int a[],int L,int R){
    if(L>R) return;
    int p=pt(a,L,R);
    QUICKSORT(a,L,p-1);
    QUICKSORT(a,p+1,R);
   
}

int main(){

    int a[50],n;

    TaoMang(a,n);
    XuatMang(a,n);
    QUICKSORT(a,0,n-1);
    XuatMang(a,n);
    

    return 0;

}