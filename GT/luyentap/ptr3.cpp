#include<stdio.h>

int main(){
   int arr[]={15,89,32,100,5};
   int* ptr=arr;
   int i,max=*ptr;


   
   for(i=1;i<5;i++){
    if(*(ptr+i)>max){
         max = *(ptr+i);
    }
   }
   printf("so lon nhat trong mang la : %d",max);

}