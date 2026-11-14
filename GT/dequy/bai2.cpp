#include<stdio.h>


struct stade{
    
    int n;
    int m;
    stade*next;
    stade(int x,int y){
        n=x;
        m=y;
        next=NULL;
    }
};
struct stack{
    stade*t=NULL;
    bool empty(){
        return t==NULL;
    }
    void push(int x,int y){
       stade*p=new stade(x,y);
       p->next=t;
       t=p; 
    }
    stade*top(){
        if(!empty()) return t;
        return NULL;
    }
    void pop(){
        if(empty()) return ;
        stade*tam=t;
        t=t->next;
        delete tam;
    }
     
};

int F2(int n,int m){
   stack st;
   st.push(n,m);
   while(st.top()->n>0){
    int x=st.top()->n;
    int y=st.top()->m;
    st.pop();
    st.push(x-1,x*y);
   }
   int res=st.top()->m;
   st.pop();
   return res;

}

int main(){
    int n,m;
    printf("nhap n:");scanf("%d",&n);
    printf("nhap m:");scanf("%d",&m);
    printf("ket qua:%d",F2(n,m));
}