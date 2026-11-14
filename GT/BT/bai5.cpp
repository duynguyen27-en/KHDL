#include<stdio.h>

void nhap(int a[],int &n){
    printf("nhap N:");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("a[%d] =",i);
        scanf("%d",&a[i]);
    }
}

void xuat(int a[],int n){
    printf("\nmang:");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}

 void SELECTSORT(int a[],int n){

    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          if(a[i]>a[j]){
            int tamp =a[i];
            a[i]=a[j];
            a[j]=tamp;
          }
        }
    }
    xuat(a,n);
 }

 void NoiBot(int a[],int n){

    for(int i=0;i<n;i++){
     
        for(int j=0;j<n-i-1;j++){
           if(a[j]>a[j+1]){              
               int tam=a[j];
               a[j]=a[j+1];
               a[j+1]=tam;      
            }    
                
            }
        }
           xuat(a,n);
    }

void INSERTSORT(int a[],int n){

    for(int i=1;i<n;i++){
        int tam=a[i];
        int j=i-1;
        while(j>=0&&a[j]>tam){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=tam;
    }
    xuat(a,n);
}

 
int main(){
    int a[50],n;

    nhap(a,n);
    xuat(a,n);
    // SELECTSORT(a,n);
    NoiBot(a,n);
    return 0;
    

}