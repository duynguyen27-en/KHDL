#include<stdio.h>
int main(){
    int a[100],n;

    printf("nhap n la :");
    scanf("%d",&n);

    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }

    int max = 0;
    for(int i=0;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
    }

    printf("%d",max);

    return 0;
}