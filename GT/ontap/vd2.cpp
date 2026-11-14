#include<stdio.h>

struct node{
    int data;
    node*next;
    node(int x){
        data =x;
        next=NULL;
    }
};

void TaoNode(node*&L,int x){
    node*Q;
    node*p;
    for(int i=0;i<5;i++){
        p=new node(x);
       
    }
     if(L==NULL){
        L=p;
        Q=p;
    }
    Q->next=p;
    Q=p;
    
}
void In(node*L){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
    printf("\n");
}

node*Travey(node*L,int y){
    node*p=L;
    int dem=0;
    while(p!=NULL&& dem<y){
        p=p->next;
        dem++;
    }
    return p;
}

void chen(node*&L,int x,node*y){
    node*Q=L;
    node*p=new node(x);
 
   while(Q->next!=NULL && Q!=y->next){
    Q=Q->next; 
   }
   p->next=Q;
   y->next=p;
}


int main(){

    node*L=NULL;
    TaoNode(L,5);
    TaoNode(L,2);
    TaoNode(L,4);
    TaoNode(L,9);
     TaoNode(L,7);
     printf("Danh sach:\n");
    In(L);
    node*y=Travey(L,1);
    printf("danh sach sau khi them 10 vao sau vi tri 2:\n");
    chen(L,10,y);
    In(L);
   return 0;
}