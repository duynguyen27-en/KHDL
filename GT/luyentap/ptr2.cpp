#include<stdio.h>


int main(){
    int arr[]={10,20,30,40,50};
    int*ptr=arr;
      int i;
    printf("cac phan tu trong mang la :");
     for(int i=0;i<5;i++){
        printf("%d ",*(ptr+i));
     }

return 0;

}