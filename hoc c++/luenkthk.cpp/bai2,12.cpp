#include <stdio.h>
#include <math.h>
int main(){
    int n;
    printf("nhap n la :");
    scanf("%d",&n);
    if(n<2){
        printf("k phai so nt");
    }else{
        for(int i=2;i<=sqrt(n);i++){
            if(n%i==0){
                printf("k phai so nt");
                return 0;
            }
        }
    }
    printf("la so nt");
    return 0;

}