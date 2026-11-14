#include<stdio.h>

struct node{
    int data;
    node*next;
    node(int x){
        data=x;
        next=NULL;
    }
};

node*hamtaonode(int x,node*q){
    node*p=new node(x);
    p->next=q;
    return p;
}
void lietke(node*L){
    node*p=L;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
    printf("\n");
}

node*travevitry(node*L,int y){
    node*p=L;
    int dem=0;
    while(p!=NULL && dem<y){
        p=p->next;
        dem++;
    }
    return p;
    
}

void xoa(node*&L,node*y){
    if(y==L){
        node*q=L;
        L=L->next;
        delete q;
        return;

    }else{
        node*q=L;
        while(q!=NULL && q->next!=y){
            q=q->next;
        }
        q->next=y->next;
        delete y;
        return;
    }
}


int main(){

    node*L=NULL;
    for(int i=0;i<5;i++){
        int x;
        scanf("%d",&x);
        L=hamtaonode(x,L);
    }
    printf("Danh sach ban dau:\n");
    lietke(L);
    node*Q=travevitry(L,2);
    xoa(L,Q);
    printf("Danh sach sau khi xoa:\n");
    lietke(L);
    
    return 0;

}