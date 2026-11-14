#include<stdio.h>
 
struct node{
    int data;
    node*next;
};

void nhap(node*&L, int n){

   
    node*p,*Q;

    for(int i=1;i<=n;i++){
        p=new node;
        scanf("%d",&p->data);
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

void  sapxep(node*&L){
    if(L==NULL || L->next=NULL) return ;
    node *p,*Q;

    for(p=L;p->next!=NULL;p=p->next){
        for(Q=p->next;Q!=NULL;Q=Q->next){
            if(p->data<Q->data){
                int tam =p->data;
                p->data=Q->data;
                Q->data=tam;
            }
        }
    }
    in(L);
}

int main(){

    int n=5;
    node*L=NULL;
    nhap(L,n);
    in(L);
    printf("\nmang sau sap xep la : ");
    sapxep(L);

    return 0;
}