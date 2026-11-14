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

int DemLa(node *T){
    if(T==NULL) return 0;
    if(T->L==NULL && T->R==NULL) return 1;
    return DemLa(T->L)+DemLa(T->R);
}
int DemNode1Con(node *T){
    if(T==NULL) return 0;
    if(T->L==NULL&&T->R!=NULL || T->L!=NULL&&T->R==NULL) return 1+DemNode1Con(T->L)+DemNode1Con(T->R);
    return DemNode1Con(T->L)+DemNode1Con(T->R);
}
int DemNode2Con(node *T){
     if(T==NULL) return 0;
    if(T->L!=NULL && T->R!=NULL ) return 1+DemNode2Con(T->L)+DemNode2Con(T->R);
    return DemNode2Con(T->L)+DemNode2Con(T->R);
}

int TimMin(node *T){
    if(T==NULL) return -1;
    while(T->L!=NULL){
        T=T->L;
    }
    return T->key;
}
int TimMax(node *T){
    if(T==NULL) return -1;
    while(T->R!=NULL){
        T=T->R;
    }
    return T->key;
}
int TongGiaTri(node *T){
    if(T==NULL) return 0;
    return T->key + TongGiaTri(T->L) + TongGiaTri(T->R);
}
int TongLonHonX(node *T, int x){
    if(T==NULL) return 0;
    if(T->key>x) return T->key + TongLonHonX(T->L,x) + TongLonHonX(T->R,x);
}
// bài này chưa hiểu nên học lại
int ChieuCao(node *T){
  if(T==NULL) return 0;

  int TL=ChieuCao(T->L);
  int TR=ChieuCao(T->R);
  if(TL>TR) return TL+1;
  return TR+1;
   
}

void RNL(node*T){
    if(T!=NULL){
        RNL(T->R);
        printf("%d ", T->key);
        RNL(T->L);
    }
}

void XoaLonHonX(node*&T, int x){
    if(T==NULL) return ;
    if(T->key>x){
        node*p=T;
        T=T->L; 
        delete p;
        XoaLonHonX(T,x);
    
    }else{
        XoaLonHonX(T->R,x);
    }
   
}


int main(){
    int a[] = {44, 18, 88, 13, 37, 59, 108, 15, 23, 40, 55, 71, 30};
    node*T=NULL;
    for(int i=0;i<13;i++){
        node*p=new node(a[i]);
        Chen(T,p);
    }
    printf("LNR:");
    LNR(T);
    // printf("\nSo la: %d", DemLa(T));
    // printf("\nSo node 1 con: %d", DemNode1Con(T));
    // printf("\nSo node 2 con: %d", DemNode2Con(T));
    // printf("\nMin: %d", TimMin(T));
    // printf("\nMax: %d", TimMax(T));
    // printf("\nTong gia tri: %d", TongGiaTri(T));
    // printf("\nTong lon hon x: %d", TongLonHonX(T, 40));
    XoaLonHonX(T,50);
    printf("\nLNR sau khi xoa: ");
    LNR(T);
    return 0;
}