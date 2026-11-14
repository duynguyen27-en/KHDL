#include<stdio.h>

struct node{
    char data;
    node*next;

    node(char x){
        data=x;
        next=NULL;
    }
};

struct stack{
    node*t=NULL;
    bool empty(){
        return t==NULL;
    }
    void push(char x){
        node*p= new node(x);
        p->next=t;
        t=p;
    }
    void pop(){
        if(empty()) return;
        node*p=t;
        t=t->next;
        delete p;
    }
    char top(){
        if(empty()) return '\0';
        return t->data;        
    }
};

struct queue{
    node*h=NULL;
    node*t=NULL;
      bool empty(){
        return h==NULL;
    }

    void push(char x){
        node*p=new node(x);
        if(empty()){
            h=t=p;
            return;
        }
        t->next=p;
        t=p;
    }

    void pop(){
        if(empty()) return;
        node*p=h;
       h=h->next;
       if(h==NULL){
        t=NULL;
       }
       delete p;
    }
    char front(){
        if(!empty()) return h->data;
        return '\0';
    }
};
struct HauTo{
    queue q;
};

int DUT(char a){
    if(a=='*' || a=='/') return 2;
    if(a=='+' || a=='-') return 1;
    return 0;
}

HauTo H2T(char*a){
    stack st;
    HauTo h;
    while(*a!='\0'){
      if(*a>='0'&&*a<='9'){
         h.q.push(*a);
      } else if(*a=='('){
        st.push(*a);
      } else if(*a==')'){
        while(!st.empty() && st.top()!='('){
            h.q.push(st.top());
            st.pop();
        }
        st.pop();
      }else{
        while(!st.empty() && DUT(st.top())>=DUT(*a)){
            h.q.push(st.top());
            st.pop();
        }
        st.push(*a);
      }
        a++;
    }
    while(!st.empty()){

        h.q.push(st.top());
        st.pop();
    }
    return h;
}

 void InHauTo(HauTo H){
    node*p=H.q.h;
    while(p!=NULL){
        printf("%c ",p->data);
        p=p->next;
    }
    printf("\n");
 }



int main(){
 char*a="((1+2)*3/9+(4-5)+7)/7";
printf("Trung to: %s\n",a);
HauTo H=H2T(a);
printf("Hau to: ");
InHauTo(H);
}