#include<stdio.h>

struct node{
    int data;
    node*next;
    node*left;
    node*right;
    node(int x){
        data =x;
        next=NULL;
        left=right=NULL;

    }
};

node*insert(node*p,int x){
    if(p==NULL){
        p= new node(x);
        return p;
    }
    if(x>p->data){

        p->right= insert(p->right,x);
    }else{

        p->left=insert(p->left,x);
    }
    return p;
}

void NLR(node*p){
    if(p!=NULL){
        printf("%d ",p->data);
        NLR(p->left);
        NLR(p->right);
    }
}

int main(){
    node*p=NULL;
    int a[50]={5,2,7,1,3,6,8,4,9};
    for(int i=0;i<9;i++){
        p=insert(p,a[i]);
    }
    printf("NLR:");
   NLR(p);
   return 0;
}