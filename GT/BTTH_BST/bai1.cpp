#include<stdio.h>
struct node{
    char key;
    node*next;
    node*L,*R;
    node(char x){
        key=x;
        next=NULL;
        L=R=NULL;
    }

};

struct stack1{
  node*T=NULL;
    bool empty(){
        return T==NULL;
    }

    void push(char x){
        node*p=new node(x);
         p->next=T;
         T=p;
       
    }

    void pop(){
        if(T==NULL) return;
        node*p=T;
        T=T->next;
        delete p;

    }
    char top(){
        if(T!=NULL) return T->key;
        return '-1';
    }
    
};

struct stack2{
    node*T=NULL;
     bool empty(){
        return T==NULL;
    }
    void push(node*p){
       if (p == NULL) return;
        p->next=T;
        T=p;

    }
    node* pop(){
        if(T==NULL) return NULL;
        node*p=T;
        T=T->next;
        p->next=NULL;
        return p;
    }
   

};


int DUT(char a){
    if(a=='*'||a=='/') return 2;
    if(a=='+'|| a=='-') return 1;
    return 0;
}


node* H2T(char*a){
    stack1 s;
    stack2 s2;
    node*H=NULL;
    while(*a!='\0'){
        if(*a>='0' && *a<='9'){
            node *p=new node(*a);
            s2.push(p);

        }
       else if(*a=='('){
            s.push(*a);
        }else if(*a==')'){
            while(s.top()!='('){
                if(!s2.empty()){
                    node*r=new node(s.top());
                    s.pop();
                    node*p1=s2.pop();;
                    node*p2=.s2.pop();;                    
                    r->R=p1;
                    r->L=p2;
                    s2.push(r);
                }
            }
           s.pop();
        }else{
            while(!s.empty() && DUT(s.top()>DUT(*a))){
                 if(!s2.empty()){
                    node*r=new node(s.top());
                    s.pop();
                    node*p1=s2.pop();;
                    node*p2=.s2.pop();;                    
                    r->R=p1;
                    r->L=p2;
                    s2.push(r);
                }
            }
            s.push(*a);
        }
        a++;
    }
    while(!s.empty()){
        if(!s2.empty()){
            node*r=new node(s.top());
                    s.pop();
                    node*p1=s2.pop();;
                    node*p2=.s2.pop();;                    
                    r->R=p1;
                    r->L=p2;
                    s2.push(r);
        }
    }
    return s2.top();
}


void inketqua(node*T){
    if(T!=NULL){
        inketqua(T->L);
        inketqua(T->R);
        printf("%c ",T->key);
    }
}

int main(){
    char*a="((2*3)+4)-5*(2-3*4)";
    node *H=H2T(a);
    printf("Trung to: %s\n",a);
    printf("Hau to: ");
    inketqua(H);
    return 0;
}