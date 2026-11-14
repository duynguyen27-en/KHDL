#include<stdio.h>
#include<stack>
#include<queue>
using namespace std;

void nhap(int &n, queue<int> &q){
    printf("nhap n :");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        q.push(x);
    }
   
}
void daonguoc(stack<int> &st, queue<int> &q){
    
    while(!q.empty()){
        st.push(q.front());
        q.pop();
    }

    while(!st.empty()){
        q.push(st.top());
        st.pop();
    }

}

void in(queue<int> q){
    while(!q.empty()){
        printf("%d ",q.front());
        q.pop();
    }
}

int main(){
    int n;
    stack<int> st;
    queue<int> q;
    nhap(n,q);
    daonguoc(st,q);
    in(q);
    return 0;

}