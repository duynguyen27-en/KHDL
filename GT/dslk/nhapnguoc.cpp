#include<stdio.h>

struct node{
    int data;
    node*next;
};

void nhap(node*&L,int n){
    
    node*p;
    for(int i=1;i<=n;i++){
        p= new node;
        p->data=i;
        p->next=L;
        L=p;

    }
}

void in(node*L){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
}

int main(){
    int n=5;
    node*L=NULL;
    nhap(L,n);
    in(L);
    return 0;
}