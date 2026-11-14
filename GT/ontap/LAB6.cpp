#include<stdio.h>

struct node{
    int data ;
    node*next;
    node(int x){
        data=x;
        next=NULL;
    }
};

node*Tao(int x, node*q){
    node*p=new node(x);
    p->next=q;
    return p;
}

void In(node*L){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
    printf("\n");
}
 node* Tim1(node *L, int x){
    node*p=L;
    while( p!=NULL && p->data<x){
        p=p->next;
    }
   return p;
 }

 node* Tim2(node *L){
    node*p=L;
    while( p!=NULL && p->data%2!=0){
        p=p->next;
    }
  return p;
 }

  void Chen(node *&L, node *p, node *q){
    node*k=L;
    if(q==L){
        p->next=L;
        L=p;
      return ;
    }
    while(k->next!=q){
        k=k->next;
    }
    p->next=q;
    k->next=p;
  }


void Xoa(node *&L, node *q){
    node*p=L;
    if(q==L){
        L=L->next;
        delete q;
        return;
    }
    while(p->next!=q){
        p=p->next;
    }
    if(p->next==q){
    p->next=q->next;
    delete q;
    }
}
int main(){
    node*L=NULL;
    L=Tao(1,Tao(3,Tao(5,Tao(7,Tao(8,NULL)))));
    In(L);
    node*KQ1=Tim1(L,3);
    if(KQ1!=NULL){
        printf("Tim thay 3 = %d\n",KQ1->data);
    } else{
        printf("khong tim thay");
    }
    node*KQ2=Tim2(L);
    if(KQ2!=NULL){
        printf("Tim thay so chan dau tien = %d\n",KQ2->data);
    } else{
        printf("khong tim thay");
    } 
    node*pos=Tim1(L,4);
    node*p=new node(4);
    Chen(L,p,pos);
    printf("Danh sach sau khi chen:\n");
    In(L);
   
    node*cur=L;
    while(cur!=NULL){
        node*k=cur->next;
        if(cur->data%2==0){
          Xoa(L,cur); 
           
        }
       cur=k;
    }
     printf("Danh sach sau khi xoa so chan:\n");
     In(L);
   
    return 0;
}