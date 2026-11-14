#include<stdio.h>

struct node{
    int key;
    node*L,*R;
    node(int x){
        key=x;
        L=R=NULL;
    }
};

void Chen(node*&T,node*p){


    if(T==NULL){
        T=p;
        return;
    }
    if(T->key>p->key){
        Chen(T->L,p);
    } else if(T->key<p->key){
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

 node* TimNode(node *T, int x){
     
    if(T==NULL) return NULL;
    if(T->key==x){
        return T;
    } else if(T->key>x){
       return TimNode(T->L,x);
    }else if(T->key<x){
        return TimNode(T->R,x);
    }
 }

 void XOALA(node *&T, node *P){
   if(T==NULL && P==NULL) return;
   if(T->key==P->key){
    if(T->L==NULL && T->R==NULL){
        node*k=T;
        T=NULL;
        delete k;
    }
    return;
}
    if(T->key>P->key){
         XOALA(T->L,P);
    }else if(T->key<P->key){
        XOALA(T->R,P);
    }
 }



int main(){
    node*T=NULL;
    int a[ ]={44, 18, 88, 13, 37, 59, 108, 15, 23, 40, 55, 71, 30};
    for(int i=0;i<13;i++){
        node*p=new node(a[i]);
        Chen(T,p);
    }
    printf("Duyet theo thu tu LNR:\n ");
    LNR(T); 

    node*KQ=TimNode(T,15);
    if(KQ!=NULL){
        printf("\nTim thay node co gia tri 15");
    }else{
        printf("\nKhong tim thay node co gia tri 15");
    }
    
    printf("\nDuyet theo thu tu LNR:\n ");
    XOALA(T,KQ);
    LNR(T); 

    return 0;

}