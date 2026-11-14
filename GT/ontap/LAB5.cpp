#include<stdio.h>

struct node{
    int data;
    node*next;
    node(int x){
        data=x;
        next=NULL;
    }
};

 void Nhap1(node *&L, int n){
    node*p,*Q;
    for(int i=1;i<=n;i++){
        p=new node(i);
         if(L==NULL){
        L=p;
        Q=p;
    }
    Q->next=p;
    Q=p;
    }
   
    }


 void Nhap2(node *&L, int n){
     node*p,*Q;
    for(int i=n;i>=1;i--){
        p=new node(i);
         if(L==NULL){
        L=p;
        Q=p;
    }
    Q->next=p;
    Q=p;
    }
   
 }

 void In(node*L){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
    printf("\n");
 }

 node* Tim(node *L, int x){
    node*p=L;
    while(p->data!=x){
        p=p->next;
    }
    if(p!=NULL){
        return p;
    }
    return NULL;
 }

 void  DaoNguoc(node *&L){
    if (L == NULL || L->next == NULL) return;
   node*p=L->next;
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
    node*L=NULL;
    int n;
    printf("nhap N:");
    scanf("%d",&n);
    Nhap1(L,n);
    printf("Danh sach 1:\n");
    In(L);
    // Nhap2(L,n);
    // printf("Danh sach 2:\n");
    // In(L);

    node*KQ=Tim(L,3);
    printf("Ket qua tim thay 3 = %d\n",KQ->data);
    printf("danh sach sau khi dao nguoc:\n");
    DaoNguoc(L);
    In(L);
  
    return 0;

}