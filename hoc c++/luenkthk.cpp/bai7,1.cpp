#include <stdio.h>
int cheak(int a[],int n,int x){
    for(int i=0;i<n;i++){
        if(a[i]==x)
        return 1;
    }
    return 0;
}
void nhapmang(int a[],int b[],int &n,int &m){
    printf("nhap so luong phan tu n :");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        do{
        printf("a[%d] =",i+1);
        scanf("%d",&a[i]);
        if(cheak(a,i,a[i])){
            printf("nhap lai\n");
        }
        }while(cheak(a,i,a[i])==1);
    }
    printf("nhap so luong phan tu m :");
    scanf("%d",&m);
    for(int i=0;i<m;i++){
        do{
        printf("b[%d] =",i+1);
        scanf("%d",&b[i]);
        if(cheak(b,i,b[i])){
            printf("nhap lai\n");
        }
        }while(cheak(b,i,b[i])==1);
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
void findIntersection(int a[],int b[],int n,int m){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(a[i]==b[j]){
                printf("%d ",a[i]);
                
            }
        }
    }

}

int main(){
    int a[100];
    int b[100];
    int m;
    int n;
    nhapmang(a,b,n,m);
    xuatmang(a,b,n,m);
    printf("\ncac phan tu giao nhau la :");
    findIntersection(a,b,n,m);
    return 0;   
}