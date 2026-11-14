#include <stdio.h>
int main(){
    int n;
    printf("nhap n");
    scanf("%d",&n);
    int sum=0;
    int s=0;
    // for(int i=1;i<=n;i++){
    //     sum+=i;
    // }
    // printf("%d",sum);
    do{
       s++;
       sum+=s;
    }while(s<n);
    printf("%d",sum);
    return 0;
}