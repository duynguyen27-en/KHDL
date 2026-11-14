#include<stdio.h>
#include<stack>
using namespace std;

void nhap(int a[], int &n){
    printf("nhap n:");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
}

void phantuMaxbp(int a[],int b[],int n,stack<int> &st){

    for(int i=0;i<n;i++){
        if(st.empty()){
            st.push(i);
        }else{
            while(!st.empty() &&a[st.top()]<a[i]){
                b[st.top()]=a[i];
                st.pop();
            }
            st.push(i);
        }
    }
    while(!st.empty()){
        b[st.top()]=-1;
        st.pop();
    }
}

void xuatra(int b[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",b[i]);
    }
}

int main(){
    int n;
    int a[50],b[50];
    stack<int> st;
    nhap(a,n);
    phantuMaxbp(a,b,n,st);
    xuatra(b,n);

    return 0;


}