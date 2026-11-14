#include<stdio.h>
 
struct node{
    int data;
    node*next;

    node(int x){
        data=x;
        next=NULL;
    }
};

void nhap(node*&L,int x){
    node*p,*Q;
    p=new node(x);
    if(L==NULL){
        L=p;
       Q=p;
    }

    Q->next=p;
    Q=p;

}

void xuat(node*L){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
}

node*chon(node*L,int x){
    node*p=L;
    while(p!=NULL && p->data!=x){
        p=p->next;
    }
    return p;
}
void xoa(node*&L,node*p){
    node*Q=L;
    while(Q->next!=p){
        Q=Q->next;
    }
    Q->next=p->next;
    delete p;
}

int main(){
    node*L=NULL;
    int n=5;
    for(int i=1;i<=n;i++){
        nhap(L,i);
    }
    xuat(L);
    node*kq=chon(L,3);
    if (kq!=NULL){
        printf("\nphan tu duoc chon la: %d\n",kq->data);
    }else{
        printf("\nkhong tim thay phan tu\n");
    }
    printf("\n sau khi xoa: ");
    xoa(L,kq);
    xuat(L);
    return 0;
}