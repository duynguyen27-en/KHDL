#include<stdio.h>

struct node{
    int data;
    node*next;
};

node*tao(int x,node *Q){
    node*p=new node;
    p->data=x;
    p->next=Q;

    return p;
   
};

void in(node*L){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
}

node*tim1(node*L,int x){
    node *p=L;
    while(p!=NULL&& p->data<x){
        p=p->next;
    }

    return p;
};

void chen(node*L , node*p, node*q){
    
   if(L==q){
    p->next=L;
    L=p;
    return;
   }
   node *k=L;
  while(k!=NULL && k->next!=q){
    
    k=k->next;
  }
   if(k==NULL) return;
    p->next=q;
    k->next=p;

}

void xoa(node*&L,node *Q){
    if(L==NULL || Q==NULL) return ;

    if(L==Q){
        node*p=L;
        L=L->next;
        delete p;
        return;
    }

    node*K=L;
    while(K!=NULL && K->next!=Q){
        K=K->next;
    }
    if(K!=NULL){
        K->next=Q->next;
        delete Q;
      return;
    }
}


int main(){
    node*L=NULL;
    L=tao(1,tao(3,tao(5,tao(7,tao(8,NULL)))));
    in(L);
    node*KQ1=tim1(L,5);
    if(KQ1==NULL){
        printf("\nkhong co tim thay node nào >= x");
    }else{
        printf("\ntim thay dia chi node >= x la : %p",KQ1);
    }
    node*p=new node;
    p->data=4;
    p->next=NULL;

    chen(L,p,KQ1);
    printf("\ndanh sach sau khi chen la : ");
    in(L);

    printf("\ndanh sach sau khi xoa la : ");
    node*x=L;
    while(x!=NULL){
        node*k=x->next;
        if(x->data%2==0){
            xoa(L,x);
        }
        x=k;
    }
    in(L);

    
    

    return 0;
}