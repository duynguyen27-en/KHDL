#include<stdio.h>

struct node{
    int n,m;
    node*next;
    node(int x,int y){
        n=x;
        m=y;
        next=NULL;
    }
};

struct stack{
    node*t=NULL;
 bool empty(){
    return t==NULL;
   }
  void push(int x, int y){
    node*p=new node(x,y);
    p->next=t;
    t=p;
  }
  void pop(){
    node*p=t;
    t=t->next;
    delete p;
  }
  node*top(){
    if(t!=NULL) return t;
    return NULL;
  }


};

int F1(int n, int m){
    if(n==0) return m;

    return F1(n-1,n*m);
}

int F2(int n, int m){
    stack st;
    st.push(n,m);
    while(st.top()->n>0){       
        int x=st.top()->n;
        int y=st.top()->m;
        st.pop();
        st.push(x-1,x*y);
       
    }
 int res =st.top()->m;
 st.pop();
 return res;
}
 int F3(int n, int m,int a[]){
    a[0]=m;
   for(int i=1;i<=n;i++){
    a[i]=i*a[i-1];
   }
   return a[n];

 }
  int F4(int n, int m){
    while(n>0){
         m=n*m;
        n=n-1;
       
    }
    return m;
  }


int main(){
int n,m;
int a[50];
printf("nhap N va M  :");
scanf("%d %d",&n,&m);
printf("ket qua F1 =%d\n",F1(n,m));
printf("ket qua F2 =%d\n",F2(n,m));
printf("ket qua F3 =%d\n",F3(n,m,a));
printf("ket qua F4 =%d\n",F4(n,m));


}