#include<stdio.h>

void taomang(int a[],int &n){
    printf("nhap N:");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("a[%d]= ",i);
        scanf("%d",&a[i]);
    }
}

void inmang(int a[],int n){
    printf("\nMang:");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}

int TongMang(int a[],int n){
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=a[i];
    }
    return sum;
}
int TimVT(int a[],int n,int x){
    for(int i=0;i<n;i++){
        if(a[i]==x) return i;
    }
    return -1;
}

void InMang1(int a[],int n){
    // In ngược mảng
    printf("\nIn nguoc mang\n");
    for(int i=n-1;i>=0;i--){
        printf("%d ",a[i]);
    }

    printf("\nin nua dau mang\n");
    for(int i=0;i<=n/2;i++){
        printf("%d ",a[i]);
    }

    printf("\nin nua sau mang\n");
    for(int i=n/2;i<n;i++){
        printf("%d ",a[i]);
    }

     printf("\nin nguoc mang nhung chay tu vi tri 0\n");
     for(int i=0;i<n/2;i++){
        int tam=a[i];
        a[i]=a[n-1-i];
        a[n-i-1]=tam;
       
     }
     inmang(a,n);


}





int main(){
    int a[50];
    int n;


    taomang(a,n);
    inmang(a,n);
    printf("\ntong mang = %d",TongMang(a,n));
    printf("\nvi tri cua so 4 = %d",TimVT(a,n,4));
    InMang1(a,n);

    return 0;
}