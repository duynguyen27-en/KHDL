#include<stdio.h>

struct node{
    int data;
    node*next;
};

void nhap(node*&L,int n){
    node*p,*Q;

    for(int i=1;i<=n;i++){
        p=new node;
        p->data=i*10;
        p->next=NULL;

        if(L==NULL){
            L=p;
            Q=p;
        }else{
            Q->next=p;
            Q=p;
        }
    }
}

void in(node*L){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
}

void xoa(node*&L, int x){
    if(L==NULL || x<=0) return ;

    if(x==1){
        node*Q=L;
        L=L->next;
        delete Q;
        return;
    }
    node*Q=L;
    for(int i=1;i<x-1;i++){
        if(Q->next==NULL) return;
        Q=Q->next;
    }

    node*p= Q->next;

    if(p==NULL) return ;

    Q->next=p->next;
    delete p;
    

}

int main(){
    int n=5;
    node*L=NULL;

    nhap(L,n);
    in(L);


}
