package tuan1;
import java.util.Scanner;
public class Cau1 {
    String itenname ;
    int price,quantity;
    float vat;
 void input(){
    Scanner kq = new Scanner(System.in);
    System.out.print("nhap ho ten hang :");
    itenname = kq.nextLine();
    System.out.print("nhap don gia :");
    price = kq.nextInt();
    System.out.print("nhap so luong :");
    quantity = kq.nextInt();
    System.out.print("nhap vat :");
    vat = kq.nextFloat();

 }
   void output(){
    int totalBeforeVAT = price*quantity;
    float totalAfterVAT = totalBeforeVAT +(totalBeforeVAT*vat);
    System.out.println("\n--- THÔNG TIN HÀNG HÓA ---");
   System.out.println("thong tin hang hoa :"+itenname+"");
   System.out.println("gia tien moi chiec :"+price+"");
   System.out.println("so luong :"+quantity+"");
   System.out.println("vat :"+vat+"");
   System.out.println("tong tien truoc thue :"+totalBeforeVAT);
   System.out.println("tong tien sau thue :"+totalAfterVAT);


   }

    public static void main(String[] args) {
         Cau1 a = new Cau1();
        a.input();
        a.output();
    }

}
