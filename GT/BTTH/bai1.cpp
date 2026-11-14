#include<stdio.h>
#include<string>
using namespace std;
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
        node*p=new node(x);
        p->next=t;
        t=p;
    }
    void pop(){
        if(empty()) return ;
        node*tam=t;
        t=t->next;
        delete tam;
    }
    char top(){
        if(!empty()) return t->data;
        return '-1';
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
        if(h==NULL){
            h=t=p;
            return ;
        }   
        t->next=p;
        t=p;
    }
    void pop(){
        if(h==NULL){
            t=NULL;
            return ;
        }
        node*tam=h;
        h=h->next;
        delete tam;
    }
    char front(){
        if(!empty()) return h->data;
        return '-1';
    }
};

struct HauTo{
    queue q;
};
int DUT(char x){
    if(x=='*' || x=='/') return 2;
    if(x=='+' || x=='-') return 1;
    return 0;
}

HauTo H2T(char*a){
    stack s;
    HauTo H;
    while(*a!='\0'){
        if(*a>='0' && *a<='9'){
         H.q.push(*a);  
        
        
    }else{
        if(*a=='('){
            s.push(*a);
        }else if(*a==')'){
            while(s.top()!='('){
                H.q.push(s.top());
                s.pop();
            }
            s.pop();
        }else{
            while(!s.empty() && DUT(s.top())>=DUT(*a) ){
                H.q.push(s.top());
                s.pop();
            }
            s.push(*a);
        }

    }
   a++;
}
    while(!s.empty()){
        H.q.push(s.top());
        s.pop();
    }
    return H;
}
void inStack(stack st){
    node*p=st.t;
   printf("Stack: ");
    while (p != NULL) {
        printf("%c ", p->data);
        p = p->next;
    }
    printf("\n");
}

void inHauTo(HauTo H){
    node*p=H.q.h;
    while (p != NULL) {
        printf("%c ", p->data);
        p = p->next;
    }
    printf("\n");
    
    
}

int main(){
    char*TrungTo="((1+2)*3/9+(4-5)+7)/7";
    printf("Bieu thuc Trung to: %s\n", TrungTo);
    
    HauTo H = H2T(TrungTo);

    printf("Bieu thuc Hau to  : ");
    inHauTo(H);

}