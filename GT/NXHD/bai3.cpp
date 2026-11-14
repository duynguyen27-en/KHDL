#include<stdio.h>
#include<stack>
#include<string>

using namespace std;

bool ktdau(int &n,stack<char> &st){
    printf("nhap so n :");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        char x;
        printf("nhap ky tu : ");
        scanf(" %c",&x);
       if(x=='('|| x=='{' || x=='['){
        st.push(x);
       } 
       else if(x==')'|| x=='}' || x==']'){
          if(st.empty()){
               return false;
          }else{
            char top =st.top();
            if((x==')'&& top=='(') || (x=='}'&& top=='{') || (x==']'&& top=='[')){
                st.pop();
            }else{
                return false;
            }
          }
       }
    }
    return st.empty();
}

int main(){
  int n;
  stack<char> st;
  bool d=ktdau(n,st);

  if(d==true){
    printf("hop le");
  }else{
    printf("khong hop le");
  }

  return 0;

}