package tuan1;
 import java.util.ArrayList;
 import java.util.Scanner;
public class Cau7 {
    ArrayList<Integer> a = new ArrayList<>();
     void input(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap n la:");
        int n = kq.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            int phantu = kq.nextInt();
            a.add(phantu);
        }
     }
     void xuatmang(){
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
     System.out.println("");
     }
     int tong(){
        int sum=0;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i);
        }
        return sum;
     }
     double tbcong(){
         double tb = (double)tong()/a.size();
         return tb;
     }
   int demsc(){
    int dem=0;
    for(int i=0;i<a.size();i++){
        if(a.get(i)%2==0){
            dem++;
        }
    }
    return dem;
   }



     void output(){
        System.out.print("mang vua nhap la :");
        xuatmang();
        System.out.println("tong cac phan tu trong mang la :"+tong());
        System.out.println("trung binh cac phan tu trong mang la :"+tbcong());
        System.out.println("so luong so chan trong mang la :"+demsc());
     }


    public static void main(String[] args) {
        Cau7 dd = new Cau7();
        dd.input();
        dd.output();    
        
    }

}
