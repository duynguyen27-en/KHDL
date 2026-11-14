package baitap;
import java.util.ArrayList;
import java.util.Scanner;
public class Mainbook {
    ArrayList<book> a = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String bookID,title;
    double price;
    int quantity;
    void themsachmoi(){
        System.out.print("nhap ID :");
        bookID = sc.nextLine();
        System.out.print("nhap ten sach :");
        title = sc.nextLine();
        System.out.print("nhap gia tien :");
        price = sc.nextDouble();
        System.out.print("nhap so luong :");
        quantity = sc.nextInt();
        sc.nextLine();
        book dd = new book(bookID,title,price,quantity);
        a.add(dd);
    }
    void hienthikhosach(){
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i).toString());
            System.out.println("");
    }
   
    }
       
   
   void capnhatgiatienID(){
    if(a.isEmpty()) return;
    System.out.print("nhap ID can cap nhat gia tien moi :");
    String IDmoi = sc.nextLine();
    for(int i=0;i<a.size();i++){
        if(a.get(i).getbookID().equals(IDmoi)){
            System.out.print("nhap gia tien moi :");
            double gia = sc.nextDouble();
            sc.nextLine();
            a.get(i).setprice(gia);
            System.out.print("Da cap nhat thanh cong !");
            return;
        }
    }
    System.out.println("khong tim thay ID");
   }
   void tinhtongtien(){
    if(a.isEmpty()) return;
     System.out.println("======tong tien kho sach======");
    double tongtien = 0;
    for(int i=0;i<a.size();i++){
         tongtien+=a.get(i).getprice()*a.get(i).getquantity();
      }
      System.out.println("tong tien ="+tongtien);
    }
   
    void output(){
      while(true){
        System.out.println("nhap lua chon menu ma ban muon");
        System.out.println("1. them danh sach moi");
        System.out.println("2. hien thi kho sach");
        System.out.println("3.cap nhat gia tien");
        System.out.println("4. tinh tong tien ");
        System.out.println("5. thoat ");
        System.out.print("nhap lua chon cua ban :");
        int chon = sc.nextInt();
        sc.nextLine();
        switch(chon){
            case 1:
                themsachmoi();
                break;
                case 2:
                    hienthikhosach();
                    break;
                    case 3:
                    capnhatgiatienID();
                    break;
                    case 4:  
                    tinhtongtien();
                    break;
                    case 5:
                        System.exit(0); 
                    break;    
                        default:
                        System.out.println("lua chon khong hop le");
                        break;  
        }
      }
    }

    public static void main(String[] args) {
        Mainbook dd = new Mainbook();
        dd.output();
    }

}
