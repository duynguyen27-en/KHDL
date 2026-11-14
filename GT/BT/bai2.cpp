#include<stdio.h>

struct node{
    int key;
    node*L,*R;

    node(int x){
        key=x;
        L=R=NULL;
    }
};

void chen(node*&T,int x){
  
    if(T==NULL){
        T=new node(x);
        return;
    }
    if(T->key>x){
        chen(T->L,x);
    }else if(T->key<x){
        chen(T->R,x);
    }
}

void NLR(node*T){
    if(T!=NULL){
        printf("%d ",T->key);
        NLR(T->L);
        NLR(T->R);
    }
}
void LNR(node*T){
    if(T!=NULL){
        LNR(T->L);
        printf("%d ",T->key);
        LNR(T->R);
    }
}
void LRN(node*T){
    if(T!=NULL){
        LRN(T->L);
        LRN(T->R);
        printf("%d ",T->key);
    }
}
void xoanodela(node*&T,int x){

    if(T==NULL) return;
    if(T->key==x){
        node*p=T;
        T=NULL;
        delete p;
        return;
    }

    if(T->key>x){
        xoanodela(T->L,x);
    }else if(T->key<x){
        xoanodela(T->R,x);
    }
}

void xoanodegoc(node*&T,int x){
    if(T==NULL) return ;
    if(T->key==x){
        if(T->L!=NULL && T->R!=NULL){
            node*Q=T->L;
            while(Q->R!=NULL){
                Q=Q->R;
            }
            T->key=Q->key;
            xoanodegoc(T->L,Q->key);
        }else if(T->L==NULL && T->R==NULL){
            node*p=T;
            T=NULL;
            delete p;
            return;
        }
    }

    if(T->key>x){
        xoanodegoc(T->L,x);
    }else if(T->key<x){
        xoanodegoc(T->R,x);
    }
}


int main(){

    int a[50]={44,18,88,13,37,59,107,15,23,40,55,71,30};
    int n=13;
    node*T=NULL;
    for(int i=0;i<n;i++){
        chen(T,a[i]);
    }
    // printf("Duyet NLR:\n");
    // NLR(T);
    printf("\nDuyet LNR:\n");
    LNR(T);
    // printf("\nDuyet LRN:\n");
    // LRN(T);
    // xoanodela(T,15);
    // printf("\nSau khi xoa:\n");
    // LNR(T);
    xoanodegoc(T,44);
     printf("\nSau khi xoa:\n");
    LNR(T);
    return 0;
}