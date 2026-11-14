#include <stdio.h>
#include <math.h>
int main(){
    int n;
    int k=0;
    do{
        k=0;
        printf("nhap n :");
        scanf("%d",&n);
       for(int i=2;i<=sqrt(n);i++){
        if(n%i==0){
             k++;
        }
       }
    }while(k>0);
    return 0;
}