#include<stdio.h>

struct node{
    int key;
    node*L,*R;
    node(int x){
        key = x;
        L=R=NULL;
    }

};

void Chen(node*&T,node*p){
    if(T==NULL){
        T=p;
        return;
    }

    if(p->key<T->key){
        Chen(T->L,p);
    }else{
        Chen(T->R,p);
    }
}

void LNR(node*T){
    if(T!=NULL){
       LNR(T->L);
       printf("%d ",T->key);
       LNR(T->R);
    }
}

int DemNode(node*T){
    if(T==NULL) return 0;
    return 1+DemNode(T->L)+DemNode(T->R);
}

int main(){
    int a[ ]={44, 18, 88, 13, 37, 59, 108, 15, 23, 40, 55, 71, 30} ;
    node*T=NULL;
     for(int i=0;i<13;i++){
        node*p=new node(a[i]);
        Chen(T,p);

    }
    printf("LNR:");
    LNR(T);
    printf("\nSo node trong cay:%d",DemNode(T));
    return 0;
}