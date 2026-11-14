#include<stdio.h>

int main(){
 int arr[]={10,20,30,40,50};
 int* ptr=arr;
 int* ptr1=&arr[0];
 int* ptr2=&arr[4];
int i;
 for(i=0;i<5/2;i++){
    int tam=*ptr1;
    *ptr1 = *ptr2;
    *ptr2 = tam;
     ptr1++;
     ptr2--;
 }
  printf("cac phan tu sau khi dao nguoc la :");

  for(i=0;i<5;i++){
    printf("%d ",*(ptr+i)); 
  }

return 0;
}