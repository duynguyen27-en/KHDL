package tuan1;
import java.util.ArrayList;
import java.util.Scanner;
public class Cau10 {
    ArrayList<Integer> a= new ArrayList<>();
  void input(){
    Scanner kq = new Scanner(System.in);
    System.out.print("nhap n la :");
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
void sapXepTangDan(){
    for(int i=0;i<a.size()-1;i++){
        for(int j=i+1;j<a.size();j++){
            if(a.get(i)>a.get(j)){
                int temp = a.get(i);
                a.set(i,a.get(j));
                a.set(j,temp);
            }
        }
    }
    System.out.print("mang sau khi sap xep la :");
    xuatmang();
}


  void output(){
       System.out.print("mang vua moi nhap la :");
       xuatmang();
       sapXepTangDan();
  }

     public static void main(String[] args) {
        Cau10 dd = new Cau10();
        dd.input();
        dd.output();
     }
}
