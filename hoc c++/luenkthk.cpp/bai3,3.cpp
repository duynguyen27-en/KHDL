#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int sum=0;
    int count=0;
    while(n>0){
        count++;
        int temp=n%10;
        sum+=temp;
        n/=10;
    }
    printf("tong=%d,so chu so=%d",sum,count);
    return 0;
}