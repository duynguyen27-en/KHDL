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

node*timNode(node*T, int x){
    node*Q=T;
    if(Q==NULL) return NULL;
    if(Q->key==x) return Q;
    if(Q->key>x){
        return timNode(Q->L,x);
    }else{

        return timNode(Q->R,x);
    }

}

void XOALA(node*&T, node *p){
   
    if(T==NULL) return ;
    if(T->key==p->key){
        if(T->L==NULL&&T->R==NULL){
            delete T;
            T=NULL;
            return;
        }else if(T->R!=NULL && T->L==NULL){
            node*Q=T;
            T=T->R;
            delete Q;
            return;

        }else if(T->L!=NULL && T->R==NULL){
            node*Q=T;
            T=T->L;
            delete Q;
            return;
        }else if(T->L!=NULL && T->R!=NULL){
            node *M= T->L;
            
            while(M->R!=NULL){
                M=M->R;
            }
            T->key=M->key;
            XOALA(T->L,M);
           return;
           
    }
}
    if(T->key>p->key){
        XOALA(T->L,p);
    }else{
        XOALA(T->R,p);
    }
    
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
   node*Q=timNode(T,37);
   if(Q!=NULL) printf("\nTim thay 37\n");
   else printf("\nKhong thay 37\n");
   XOALA(T,Q);
   printf("LNR:");
   LNR(T);
   return 0;
}