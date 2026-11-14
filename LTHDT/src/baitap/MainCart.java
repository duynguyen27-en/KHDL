package baitap;
import java.util.ArrayList;
import java.util.Scanner;

public class MainCart {
    ArrayList<product> a = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String proID,proname;
   double price;
public void nhatsanpham(){
    System.out.print("ID :");
    proID = sc.nextLine();
    System.out.print("ten san pham :");
    proname = sc.nextLine();
    System.out.print("gia tien :");
    price = sc.nextDouble();
    sc.nextLine();
    product dd = new product(proID,proname,price);
    a.add(dd);
}
public void hienthimonhang(){
    if(a.isEmpty()) return;
    System.out.println("======Danh sach san pham ======");
    for(int i=0;i<a.size();i++){
        System.out.print(a.get(i).toString());
        System.out.println(" ");
    }
}
public void xoasanpham(){
    if(a.isEmpty()) return;
    System.out.print("nhap ID san pham muon xoa :");
    String ID = sc.nextLine();
    for(int i=0;i<a.size();i++){
        if(a.get(i).getproID().equals(ID)){
            a.remove(i);
            return;
        }
    }
    System.out.println("khong tim thay san pham co ID"+ID);
}

public void output(){
    while(true){
        System.out.println("======Menu======");
        System.out.println("1.nhat san pham bo vao gio hang");
        System.out.println("2.xem cac mon do co trong gio hang");
        System.out.println("3.xoa san pham trong gio hang");
        System.out.println("4.thoat chuong trinh");
        System.out.print("nhap lua chon cua ban :");
        int chon = sc.nextInt();
        sc.nextLine();
        switch(chon){
            case 1:
               nhatsanpham();
               break;
               case 2: 
               hienthimonhang();
               break;
               case 3:
                xoasanpham();
                break;
               case 4:
                System.exit(0);
                break;
                default:
                System.out.println("lua chon khong hop le");
                break;
        }
    }
}

    public static void main(String[] args) {
        MainCart cart = new MainCart();
        cart.output();
    }

}
