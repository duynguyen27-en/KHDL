package baitap;
import java.util.ArrayList;
import java.util.Scanner;
public class mainHoaDonCaPhe {
    Scanner kq = new Scanner(System.in);
    ArrayList<HoaDonCaPhe> a = new ArrayList<>();
    int n;
    String ten;
    double gia,khoiluong,x,y;
   
    HoaDonCaPhe hd;
    void input(){
     
      System.out.print("nhap so luong hoa don :");
      n=kq.nextInt();
   kq.nextLine();
      for(int i=0;i<n;i++){
      System.out.print("nhap ten san pham :");
      ten=kq.nextLine();
      System.out.print("nhap don gia :");
      gia=kq.nextDouble();
       System.out.print("nhap khoi luong :");
       khoiluong = kq.nextDouble();
       kq.nextLine();
        hd = new HoaDonCaPhe(ten,gia,khoiluong);
       a.add(hd);
       System.out.println("");
      }
    }
      void xuatmang(){
        for(int i=0;i<a.size();i++){
        System.out.println("tong tien hoa don "+i+": "+a.get(i).tinhTongTien());
         System.out.print("nhap khoi luong can so sanh : ");
        x=kq.nextDouble();
        System.out.println("kiem tra khoi luong hoa don "+i+" > khoi luong "+x+" :"+a.get(i).kiemTraKhoiLuongLH(x));
        System.out.println("kiem tra tong tien co > 500k :"+a.get(i).kiemTraTongTienLH500k());
         System.out.print("nhap gia tri giam gia : ");
        y = kq.nextDouble();
        System.out.println("giam gia :"+a.get(i).giamGia(y));
        System.out.println("gia sau khi giam :"+a.get(i).giaSauKhiGiam(y));
        System.out.println("");
        }
      }
       
      void output(){
        System.out.println("==================DanhSach===================");
        xuatmang();
        System.out.println("===================ketthuc===================");


       }
    public static void main(String[] args) {
         mainHoaDonCaPhe  nn = new mainHoaDonCaPhe();
         nn.input();
         nn.output();
         
    }

}