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
    }else if(T->key<p->key){
        Chen(T->R,p);
    }
}

void IN(node*T){
    if(T!=NULL){
        IN(T->L);
        printf("%d ",T->key);
        IN(T->R);
    }
}
int DemNode(node *T){
    if(T==NULL) return 0;
    return 1+  DemNode(T->L)+ DemNode(T->R);
}

int main(){
    node*T=NULL;
    int a[]={44, 18, 88, 13, 37, 59, 108, 15, 23, 40, 55, 71, 30};
    for(int i=0;i<13;i++){
        node*p=new node(a[i]);
        Chen(T,p);
    }
    printf("duyet cay theo thu tu giua:");
    IN(T);
    printf("\nso node trong cay la : %d",DemNode(T));
    return 0;


}