#include<stdio.h>
int F4(int n, int m) {
    while (n > 0) {
        m = n * m; 
        n = n - 1; 
    }
    return m; 
}

int main(){
    int n,m;
    printf("nhap n:");scanf("%d",&n);
    printf("nhap m:");scanf("%d",&m);
    printf("ket qua:%d",F4(n,m));
}