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
    }else{
        if(T->key>p->key){
            Chen(T->L,p);
        }else if(T->key<p->key){
            Chen(T->R,p);
        }
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
    }
    if(T->key>x) return TimNode(T->L,x);

    return TimNode(T->R,x);
    
 }
 void XOA1CON(node *&T, node *p){
    if(T->key==p->key){
        if(T->L!=NULL && T->R==NULL){
            node*Q=T;
            T=T->L;
            delete Q;
            return;
        }else if(T->L==NULL && T->R!=NULL){
            node*Q=T;
            T=T->R;
            delete Q;
            return;
        }
    }
    if(T->key>p->key){
        XOA1CON(T->L,p);
    }else if(T->key<p->key){
        XOA1CON(T->R,p);
    }
 }
void XOA2CON(node *&T, node *P){
   
    if(T->key==P->key){
         if(T->R==NULL && T->L==NULL){
        node*Q=T;
        T=NULL;
        delete Q;
        return;
        
    }
      if(T->L!=NULL && T->R!=NULL){
          node*M=T->L;
        while(M->R!=NULL){

            M=M->R;
        }
        T->key=M->key;
        XOA2CON(T->L,M);        
         return;
      }
    }
    if(T->key>P->key){
        XOA2CON(T->L,P);
    }else if(T->key<P->key){
        XOA2CON(T->R,P);
    }
}

int main(){
    int a[ ]={44, 18, 88, 13, 37, 59, 108, 15, 23, 40, 55, 71, 30} ;
    node*T=NULL;
    for(int i=0;i<13;i++){
        node*p=new node(a[i]);
        Chen(T,p);
    }
    printf("LNR :");
    LNR(T);
    node*Q=TimNode(T,13);
    if(Q==NULL) printf("\nKhong tim thay 13\n");
    else printf("\nTim thay 13\n : %p",Q);

    printf("\ncay sau khi xoa:%d\n",Q->key);
    XOA1CON(T,Q);
    LNR(T);
    node*M=TimNode(T,37);
    printf("\ncay sau khi xoa:%d\n",M->key);
    XOA2CON(T,M);
    LNR(T);
    

    return 0;
}