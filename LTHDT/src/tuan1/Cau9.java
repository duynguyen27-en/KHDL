package tuan1;
import java.util.ArrayList;
import java.util.Scanner;
public class Cau9 {
    ArrayList<Integer> a = new ArrayList<>(); 
    void input(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap so n la:");
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

     void cheak(){
        Scanner kq = new Scanner(System.in);
        System.out.print("nhap gia ti x  :");
        int x = kq.nextInt();
        int count=0;
        System.out.print("Vi tri index cua " + x + " xuat hien la: ");
        for(int i=0;i<a.size();i++){
            if(a.get(i)==x){
                count++;
                System.out.print(i+" ");
                a.set(i,0);
            }
        }
        System.out.println("");
    if(count==0){
        System.out.print("khong tim thay so "+x+" trong mang");
    }else{
    System.out.println("mang sau khi them 0 vao vi tri cua "+x+" la :");
    xuatmang(); 
    }
     }

   void output(){
    System.out.print("mang vua moi nhap la :");
    xuatmang();
    cheak();

   }

    public static void main(String[] args) {
        Cau9 dd = new Cau9();
        dd.input();
        dd.output();
    }

}
