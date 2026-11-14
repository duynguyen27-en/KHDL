#include<stdio.h>
int F3(int n,int m,int a[]){
    a[n]=m;
  for(int i=n;i>0;i--){
    a[i-1]=i*a[i];
  }
  return a[0];
   
     
}
int main(){
   int a[50];
   int n,m;
   printf("nhap n");scanf("%d",&n);
   printf("nhap m");scanf("%d",&m);
   
   printf("kq:%d",F3(n,m,a));
   return 0;
}