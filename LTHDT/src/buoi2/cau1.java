package buoi2;
import java.util.ArrayList;
import java.util.Scanner;
public class cau1 {
    int n;
    ArrayList <Integer> a = new ArrayList<>();
 void input(){
    Scanner kq = new Scanner(System.in);
    do{
       System.out.print("nhap so n la :");
       n = kq.nextInt();
    } while(n<=0 || n>10);

    for(int i=0;i<n;i++){
        System.out.print("a["+i+"]=");
        int phantu = kq.nextInt();
        a.add(phantu);
    }
 }
 void xuatmang(){
    for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+"   ");
    }
    System.out.println("");
 }
 int timMax(){
    int max = a.get(0);
    for(int i=0;i<a.size();i++){
        if(a.get(i)>max){
            max = a.get(i);
        }
    }
    return max;
 }
int MaxMin(){
    int max = a.get(0);
    int min = a.get(0);
    for(int i=0;i<a.size();i++){
        if(a.get(i)>max){
            max=a.get(i);
        }
        if(a.get(i)<min){
            min = a.get(i);
        }
    }
    return max-min;
}
int tongchan(){
    int sum=0;
    for(int i=0;i<a.size();i++){
        if(a.get(i)%2==0){
            sum+=a.get(i);
        }
    }
    return sum;
}
int tongmax(){
    int max = a.get(0)+ a.get(1);
    for(int i=1;i<a.size()-1;i++){
       int tong = a.get(i)+ a.get(i+1);
       if(tong>max){
        max = tong;
       }
    }
    return max;
}
void nhapgiatri(){
    Scanner kq = new Scanner(System.in);
    System.out.print("nhap gia tri can thay the :");
    int x= kq.nextInt();
    System.out.print("nhap vi tri can thay the :");
    int i= kq.nextInt();
    a.add(i,x);
    System.out.print("mang sau khi chen la :");
    xuatmang();
    
}
void xoa(){
    Scanner kq = new Scanner(System.in);
    System.out.print("nhap vi tri can xoa la :");
    int i= kq.nextInt();
    a.remove(i);
    System.out.print("mang sau khi xoa la :");
    xuatmang();
}
void sapxep(){
    for(int i=0;i<a.size()-1;i++){
        for(int j=i+1;j<a.size();j++){
            if(a.get(i)>a.get(j)){
                int temp = a.get(i);
                a.set(i,a.get(j));
                a.set(j,temp);
            }
        }
    }
    System.out.print("mang sau sap xep la :");
    xuatmang();
}


 void output(){
    System.out.print("mang vua tao la :");
    xuatmang();
    System.out.println("phan tu lon nhat la :"+timMax());
    System.out.println("hieu max va min la :"+MaxMin());
    System.out.println("cac cap co tong lon nhat la  :"+tongmax());
   
   System.out.println("\ntong cac so chan la :"+tongchan());
    nhapgiatri();
    xoa();
    sapxep();
 }

public static void main(String[] args) {
    cau1 dd = new cau1();
    dd.input();
    dd.output();  
}

}
