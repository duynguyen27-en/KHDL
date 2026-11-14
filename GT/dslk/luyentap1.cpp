#include<stdio.h>

struct node{
    int data ;
    node*next;

};

   void  nhap1(node*&L,int n){
    node*Q,*p;

    for(int i=1;i<=n;i++){
        p= new node;
        p->data=i;
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
 
void nhap2(node*&L,int n){
    node*p;
    for(int i=1;i<=n;i++){
        p=new node;
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

node*tim(node*L,int x){
   
    node*p=L;
    while(p!=NULL && p->data!=x){
        p=p->next;
    }
    return p;
}

void DaoNguoc(node*&L){
    if(L==NULL || L->next==NULL) return ;

    node*p=L->next;
    L->next=NULL;

    while(p!=NULL){
        node*Q=p->next;
        p->next=L;
        L=p;
        p=Q;
    }
}

int main(){
   int n=5;
   node*L1=NULL;
   node*L2=NULL;
   nhap1(L1,n);
   in(L1);
   printf("\n");
//    nhap2(L2,n);
//    in(L2);

 node* KQ=tim(L1,4);
   if(KQ==NULL){
    printf("\nkhong tìm thay gia trị can tim");
   } else{
      printf("\nnode ma minh tim thay la : %p",KQ);
   }
   printf("\n");
   DaoNguoc(L1);
   printf("\ndanh sach sau khi dao nguoc la : ");
   in(L1);

}