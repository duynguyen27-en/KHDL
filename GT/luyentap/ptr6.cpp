#include<stdio.h>

int main(){
    int mang_goc[5]={10,20,30,40,50};
    int mang_copy[5];
    int* ptr1 = mang_goc;
    int* ptr2 = mang_copy;

    int i;
    for(i=0;i<5;i++){
        *(ptr2+i) =*(ptr1+i);
    }

    printf("mang copy la :");
    for(i=0;i<5;i++){
        printf("%d ",*(ptr2+i));
    }

    printf("\nmang goc la :");
    for(i=0;i<5;i++){
        printf("%d ",*(ptr1+i));
    }
    return 0;

}