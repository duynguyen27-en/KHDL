#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int main(){
    int A,B,C;
    printf("nhap 3 so A B C :");
    scanf("%d %d %d",&A,&B,&C);
    int x,y;
    printf("nhap x y :");
    scanf("%d %d",&x,&y);
    float h=(abs(A*x + B*y +C))/(sqrt(A*A + B*B));
    printf("h=%.2f",h);
    return 0;
    
    
}