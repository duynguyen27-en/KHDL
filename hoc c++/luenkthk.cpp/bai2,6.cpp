#include <stdio.h>
int main(){
    int n,k;
    printf("nhap so luong N :");
    scanf("%d",&n);
    int sum=0;
   for(int i=1;i<=n;i++){
        printf("nhap i= %d:\n",i);
        scanf("%d",&k);
        sum+=k;
   }
    printf("tong la :%d\n",sum);
    return 0;
}