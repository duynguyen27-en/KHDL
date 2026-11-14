#include<stdio.h>

struct node{
    int data;
    node*next;
};

void nhap(node*&L , int n){
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

void in(node *L, int n){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
}

void hamDaoNguov(node*&L){

    if(L==NULL|| L->next==NULL) return;


    node*p= L->next;
    L->next=NULL;

    node*Q;
    while(p!=NULL){
        Q=p->next;
        p->next=L;
        L=p;
        p=Q;
    }

}

int main(){
    int n=5;
    node*L=NULL;
    nhap(L,n);
    in(L,n);
    printf("\n");
    
    hamDaoNguov(L);
    in(L,n);

    return 0;


}