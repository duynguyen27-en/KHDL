#include<stdio.h>
#include<stack>
#include<queue>
#include<string>
#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"nhap n:";
    cin>> n;
    queue<string> q;
    q.push("1");
   
    for(int i=0;i<n;i++){
       
       string s=q.front();
       cout<<s<<"\t";
       q.pop();
       q.push(s+"0");
       q.push(s+"1");        
    }
   

    return 0;
    
}