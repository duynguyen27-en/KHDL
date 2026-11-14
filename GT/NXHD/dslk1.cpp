#include<stdio.h>
#include<iostream>
#include<string>
using namespace std;

struct node{
    string data;
    node*next;
     node(string x){
        data=x;
        next=NULL;
     }
};

struct queue{
    node*h=NULL;
    node*t=NULL;
   bool empty(){
    return h==NULL;
   }

   void push(string x){
    node*p=new node(x);
    
    if(empty()){
        h=t=p;
        return;
    }
   t->next=p;
   t=p;
   }

   void pop(){
    
    if(h==NULL){
        t=NULL;
        return;
    }
    node*tam=h;
    h=h->next;
    delete tam;

   }
   string front(){
    if(!empty()){
        return h->data;
    }
    return "-1";
   }

};
struct stack{
    node*t=NULL;
    bool empty(){
        return t==NULL;
    }
    
    void push(string x){
        node*p=new node(x);
        p->next=t;
        t=p;
    }
    void pop(){
        if(empty()) return ;
        node*tem=t;
        t=t->next;
        delete tem;
    }
    string top(){
        if(!empty()) return t->data;
        return "-1";
    }

};

void themkh(queue &q){
    string x;
    cout<<"\nNhap Ten Nguoi : ";
    cin>>x;
    q.push(x);
    cout<<"\nThem Thanh Cong\n";

}
void banve(queue &q,stack &st){
    if(q.empty()){
        cout<<"\nHien Tai Dang Khong Co Khach Hang Nao";
        return;
    }
    string x =q.front();
    q.pop();
    st.push(x);
    cout<<"\nDa Ban Ve Thanh Cong Cho :"<<x<<"\n";
}
void hoanve(stack &st){
    if(st.empty()){
        cout<<"\nHien Tai Khong Co Khach Hang Nao \n";
        return;
    }
    string x = st.top();
    st.pop();
    cout<<"\nDa Thu Hoi Ve Va Hoan Tien Cho Khach Hang :"<<x<<"\n";
}
void trangthai(queue q,stack st){
    cout<<"\n===========Danh Sach KH Dang Doi=============\n";
    node*pQ=q.h;
    while(pQ!=NULL){
      cout<<"\n"<<pQ->data;
      pQ=pQ->next;
    }
    cout<<"\n===========Danh Sach KH Dang Mua Ve=============\n";
    node*pSt=st.t;

    while(pSt!=NULL){
        cout<<"\n"<<pSt->data;
       pSt=pSt->next;
    }


}


int main(){
    stack st;
    queue q;
    int n;
    do{
        cout<<"\n===========Menu=========\n";
        cout<<"\n1.Them Khach Hang\n";
        cout<<"\n2.Ban Ve\n";
        cout<<"\n3.Hoan Ve\n";
        cout<<"\n4.Trang Thai\n";
        cout<<"\n5.Thoat\n";
       
        cout<<"Nhap n: ";cin>>n;
        
        switch (n) {
            case 1:
                themkh(q);
                break;
            case 2:
                banve(q, st);
                break;
            case 3:
                hoanve(st);
                break;
            case 4:
                trangthai(q, st);
                break;
            case 5:
                return 0;
            default:
                cout << "\nLua chon khong hop le!\n";
                break;
        }


    } while(n!=5);


}