#include<stdio.h>
int main(){
  int n;
  printf("nhap so nguyen La :");
  scanf("%d",&n);
   
  for(int i=2;i<n/2;i++){
    if(n%i==0){
        printf("k la so nguyen to");
    }
  }
  


}