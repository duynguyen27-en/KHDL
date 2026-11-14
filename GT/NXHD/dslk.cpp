#include<stdio.h>

struct node{
    int data;
    node*next;

    node(int x){
        data=x;
        next=NULL;
    }
};

  struct stack{
    node*t=NULL;
    bool empty(){
        return t=NULL;
    }
    
    void push(int x){
        node*p=new node(x);
        p->next=t;
        t=p;
    }
    void pop(){
        if(empty()) return;
        node*temp=t;
        t=t->next;

        delete temp;
    }
      int top(){

        if(!empty()) return t->data;
        return -1;
      }

  };



struct queue{
    node*h=NULL;
    node*t=NULL;
   
    bool empty(){
        return h==NULL;
    }

    void push(int x){
        node*p= new node(x);
        if(empty()){
            h=t=p;
            return ;
        }
        t->next=p;
        t=p;
    }

    void pop(){
        if(empty()) return;
        node*tem=h;
        h=h->next;
        if(h==NULL) t=NULL;
        delete tem;
    }

    int front(){
        if(!empty()){
            return h->data;
        }
        return -1;
    }


};



int main(){

    queue q;
    stack st;
    
    
return 0;

}