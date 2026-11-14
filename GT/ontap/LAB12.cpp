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
    if(T->key==x) return T;

    if(T->key>x){
        return  TimNode(T->L,x);
    }else if(T->key<x){
        return  TimNode(T->R,x);
    }
}

void XOA1CON(node *&T, node *p){
    if(T==NULL || p==NULL) return;

    if(T->key>p->key){
        XOA1CON(T->L,p);
    }else if(T->key<p->key){
        XOA1CON(T->R,p);
    } else if(T->key==p->key){
        if(T->L==NULL&&T->R!=NULL ){
            node*k=T;
            T=T->R;
            delete k;

        }else{
            node*k=T;
            T=T->L;
            delete k;
        }
        return;
    }
}

void XOA2CON(node *&T, node *p){
     if(T==NULL || p==NULL) return;

    if(T->key>p->key){
        XOA2CON(T->L,p);
    }else if(T->key<p->key){
        XOA2CON(T->R,p);
    } else if(T->key==p->key){
        if(T->L==NULL && T->R==NULL){
        node*k=T;
        T=NULL;
        delete k;
    }   
    else if(T->L!=NULL && T->R==NULL){
            node*k=T;
            T=T->L;
            delete k;
        }
        else if(T->L==NULL && T->R!=NULL){
            node*k=T;
            T=T->R;
            delete k;
        }  
    else if(T->L!=NULL && T->R!=NULL){
            node*Q=T->L;
            while(Q->R!=NULL){
                Q=Q->R;
            }
            T->key=Q->key;
            XOA2CON(T->L,Q);
        }
        return;
    }
}


int main(){
    node*T=NULL;
     int a[ ]={44, 18, 88, 13, 37, 59, 108, 15, 23, 40, 55, 71, 30} ;
     for(int i=0;i<13;i++){
        node*p=new node(a[i]);
        Chen(T,p);  
     }
     printf("Duyet theo thu tu LNR:\n ");
     LNR(T); 
     node*kq=TimNode(T,23);
     if(kq!=NULL){
        printf("\nTim thay");
     }else{
        printf("\nKo tim thay");
     }
     
   XOA1CON(T,kq);
   printf("sau khi xo 1 con:\n ");
   LNR(T); 

    node*kq1=TimNode(T,37);    
   XOA2CON(T,kq1);
   printf("\n sau khi xo 2 con:\n ");
   LNR(T); 


}