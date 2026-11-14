#include<stdio.h>

struct node{
    int data;
    node*next;
};

void NHAP(node*&L,int n){
    node *p,*Q;
    for(int i=1;i<=n;i++){
        p= new node;
        p->data=i;
        p->next=NULL;

        if(L==NULL){
            L=p;
            Q=p;
        } else{
            Q->next=p;
            Q=p;
        }
    }
}
void IN(node*L,int n){
    node*p=L;
    while(p!=NULL){
      printf("%d ",p->data);
      p=p->next;

    }
}

int DEM(node*L , int n){
    node*p=L;
    int dem=0;
    while(p!=NULL){
        dem++;
        p=p->next;
    }
    return dem;
}

int Tong(node*L, int n){
    node*p=L;
    int tong=0;
    while(p!=NULL){
        tong+=p->data;
        p=p->next;
    }
    return tong;
}

int main(){
int n=5;
node*L=NULL;
NHAP(L,n);
IN(L,n);
printf("\nso node trong danh sach la : %d",DEM(L,n));
printf("\ntong cac phan tu trong danh sach la : %d",Tong(L,n));
return 0;

}