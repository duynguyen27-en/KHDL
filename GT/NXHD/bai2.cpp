#include<stdio.h>
#include<stack>
using namespace std;

void chuyennhiphan(int n, stack<int> &st){
    while(n>0){
      st.push(n%2);
      n/=2;
    }
}
void xuatranhiphan(stack<int> st){
    while(!st.empty()){
        printf("%d",st.top());
        st.pop();
    }
}

int main(){
  int n;
  printf("nhap n: ");
  scanf("%d",&n);
  stack<int> st;
  chuyennhiphan(n,st);
  xuatranhiphan(st);

  return 0;

}