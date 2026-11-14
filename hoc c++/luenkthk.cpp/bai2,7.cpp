#include <stdio.h>
int main(){
    int n;
    int sum=0;
    do{
        printf("nhap n:");
        scanf("%d",&n);
        if(n%2==0){
          sum++;
        }
    }while(n!=0);
    printf("tong so chan :%d",sum);
    return 0;
}