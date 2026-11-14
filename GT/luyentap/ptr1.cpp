#include<stdio.h>
void hoan_doi(int *a,int *b){
    int tam = *a;
    *a=*b;
    *b=tam;
}


int main(){
    int a=10,b=20;

    int*prt1 = &a;
    int*prt2 = &b;

    printf("truoc khi doi : a=%d, b=%d",*prt1,*prt2);
    hoan_doi(prt1,prt2);
     printf("\nsau  khi doi : a=%d, b=%d",*prt1,*prt2);

 return 0;
 
}