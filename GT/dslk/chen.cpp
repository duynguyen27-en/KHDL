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

void in(node*L){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
}

void chen(node*&L, int x,int pos){
    node*p;
    if(pos==1 || L==NULL){
        p=new node;
        p->data=x;
        p->next=L;
        L=p;
        return;
    }

    node*Q=L;
    for(int i=1;i<pos-1;i++){

        while(Q->next==NULL){

            break;
        }
        Q=Q->next;
    }

    p=new node;
    p->data=x;
    p->next=Q->next;
    Q->next=p;
}

int main(){
    int n=5;
    node*L=NULL;
    nhap(L,n);
    in(L);
    printf("\ndanh sach sau khi chen la : ");

    chen(L,5,6);
    in(L);

    return 0;

}