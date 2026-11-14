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

int TimVT(int a[],int n,int x){

    int L=0;
    int R=n-1;
    int M=(L+R)/2;
    while(L<=R){
        if(a[M]==x){
            return M;
        }else if(a[M]<x){
            L=M+1;
        }else{
            R=M-1;
        }
        M=(L+R)/2;
    }
    return -1;
}

void chen(int a[],int &n,int x,int vt){
    for(int i=n;i>=vt;i--){
        a[i]=a[i-1];
    }
    a[vt]=x;
    n++;

}
void xoa(int a[],int &n,int vt){
    for(int i=vt;i<n;i++){
        a[i]=a[i+1];
    }
    n--;
}
int main(){
    int a[50];
    int n;
    int x;


    taomang(a,n);
    inmang(a,n);
    // printf("nhap x:");
    // scanf("%d",&x);
    // if(TimVT(a,n,x)==-1){
    //     printf("khong tim thay x");
    // }else{
    //     printf("tim thay x o vi tri %d",TimVT(a,n,x));
    // }
    // chen(a,n,99,2);
    // inmang(a,n);
    xoa(a,n,2);
    inmang(a,n);
     

    return 0;
}