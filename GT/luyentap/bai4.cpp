#include <stdio.h>
struct node{ int data; node*next;};
void nhap(node*&l,int n);
void in(node*l,int n);
int main(){
    node*l=NULL;
    int n=5;
  nhap(l,n);
  in(l,n);
  return 0;
}

void nhap(node*&l,int n){
    node*p,*Q;
    for(int i=1;i<=n;i++){

        p = new node;
        p->data=i;
        p->next=NULL;
       if(l==NULL){
        l=p;
        Q=l;
       }else{
        Q->next=p;
        Q=p;

       }
    }


    }
    void in(node*l,int n){
        node*q=l;
        for(int i=1;i<=n;i++){
            printf("%d",q->data);
            q=q->next;
        }
    }