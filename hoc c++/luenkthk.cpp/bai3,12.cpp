#include <stdio.h>
int main(){
    int n;
    printf("nhap n la :");
    scanf("%d",&n);
    int sum=0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum+=i;
        }
    }
    if(n==sum){
        printf("\nso hoan hao");
    }else{
        printf("\nso k hoan hao ");
    }
    return 0;
}