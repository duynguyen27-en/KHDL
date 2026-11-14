#include <stdio.h>
int main(){
    int t,m;
    printf("nhap t va m la :");
    scanf("%d %d",&t,&m);
    int tu=t;
    int mau=m;
    int temp;
    if(t<m){
        temp=t;
        t=m;
        m=temp;
    }
    while(m!=0){
        int r=t%m;
        t=m;
        m=r;
    }
    printf("ucll=%d",t);
   tu=tu/t;
   mau=mau/t;
    printf("\nrut gon =%d/%d",tu,mau);
    return 0;
}