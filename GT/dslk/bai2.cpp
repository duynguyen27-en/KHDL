#include<stdio.h>

struct node{
    int data;
    node*next;
};

void nhap(node*&L,int n){
    node *p,*Q;

    for(int i=1;i<=n;i++){
        p= new node;
        p->data=i*3;
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

void in(node*L,int n){
    node *p=L;
    while(p!=NULL){
        printf("%d ",p->data );
        p=p->next;
    }
}

node*Tim_Chan_Dau_Tien(node*L){
    node*p=L;
    while(p!=NULL){
        if(p->data%2==0){
          return p;
        }
        p=p->next;
    }

}

int main(){
    int n=5;
    node*L=NULL;

    nhap(L,n);
    in(L,n);
    node*KQ = Tim_Chan_Dau_Tien(L);
    if(KQ==NULL){
        printf("\nkhong tim thay so chan dat tien");

    }else{
        printf("\nso chan dau tien la : %d",KQ->data);
        printf("\ndia chi của so chan dau tien la : %p",KQ);

        node*p=KQ;
        p->data=5;
       

        printf("\ndanh sach sau khi thay doi la : ");
         in(L,n);
        
         node*Q= new node;
         Q->data=99;
         Q->next=NULL;

         Q->next=KQ->next;
         KQ->next=Q;
         printf("\ndanh sach sau khi chen them la : ");
         in(L,n);

    }
    

}