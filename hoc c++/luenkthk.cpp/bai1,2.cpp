#include <stdio.h>
int main(){
    int a,b;
    printf(" so a :");
    scanf("%d",&a);
    printf("so b :");
    scanf("%d",&b);
    // int temp=a;
    // a=b;
    // b=temp;
    // printf("\nso a :%d",a);
    // printf("\nso b :%d",b);
    int s= a+b;
    int A=s-a;
    int B=s-b;
    printf("\nso a :%d",A);
    printf("\nso b :%d",B);
    return 0;

}