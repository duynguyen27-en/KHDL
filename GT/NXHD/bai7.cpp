#include<stdio.h>
#include<queue>
#include<string>
#include<iostream>
using namespace std;

void themkhac(queue<string> &q){
    string them;
    cout<<"Nhap Ten Nguoi: ";
    cin>>them;
    q.push(them);
    cout<<"them Thanh Cong!!!\n";
}
void banve(queue<string> &q){
    if(!q.empty()){
        cout<<"\ndang phuc vu va ban ve cho :"<<q.front()<<"\n";
        q.pop();
        cout<<"ban thanh cong\n";
    }else{
        cout<<"\nhien dang khong co khac hang nao xep hang";
    }
}

void trangthai(queue<string> q){
    int sum=q.size();
  if(q.empty()){
    cout<<"\nhien dang khong co khac hang nao xep hang\n";
    cout<<"\nso khach hang dang doi la :"<<sum<<"\n";
  }else{
    cout<<"\nso khach hang dang doi la :"<<sum<<"\n";
    cout<<"\nkhach hang tiep theo phuc vu la :"<<q.front()<<"\n";
  }
}


int main(){
    queue<string> q;
    int n;
  do{
    cout<<"\n=================Menu==============\n";
   cout<<"1:Xep Hang\n";
   cout<<"2:ban Ve\n";
   cout<<"3:trang thai\n";
   cout<<"4:thoat\n";
   cout<<"nhap n: ";cin>>n;
switch(n){
  case 1:
    themkhac(q);
    
    break;
   case 2:
       banve(q);
       break;
   case 3:
       trangthai(q);
       break;
   case 4:
       return 0;
   default:
       cout<<"nhap sai vui long nhap lai";
       break;

}
}while(n!=4);
   
}