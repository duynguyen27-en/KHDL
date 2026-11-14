package baitap;
import java.util.ArrayList;
import java.util.Scanner;
public class Mainstudent {
  ArrayList<student> a = new ArrayList<>();
  Scanner kq = new Scanner(System.in);
  String ID,name;
  int age;
  double GAP;
  void themsinhvien(){
    System.out.print("nhap ID :");
    ID = kq.nextLine();
    System.out.print("nhap ten :");
    name = kq.nextLine();
    System.out.print("nhhap tuoi :");
    age = kq.nextInt();
    System.out.print("nhap diem :");
    GAP = kq.nextDouble();
    kq.nextLine();
    student dd = new student(ID,name,age,GAP);
    a.add(dd);
    System.out.println("-> Da them sinh vien thanh cong!");
  }
  void hienthidanhsach(){
    System.out.println("\n--- DANH SACH SINH VIEN ---");
    if(a.isEmpty()){
      System.out.println("-->danh sách rong");
    }
    for(int i=0;i<a.size();i++){
      a.get(i).printInfo();
    }
  }
  void suatensinhvien(){
    System.out.println("\n--- SUA TEN SINH VIEN ---");
    System.out.print("nhap ID can sua ten la :");
    String timID = kq.nextLine();
    int index = -1;
    for(int i=0;i<a.size();i++){
      if(a.get(i).getID().equals(timID)){
        index=i;
        break;
      }
    }
    if(index!=-1){
      System.out.print("nhap ten moi la :");
      String tenmoi = kq.nextLine();
      a.get(index).setname(tenmoi);
      System.out.println("da cap nhat ten thanh cong ");
    }else{
      System.out.println("->khong tim thay sinh vien nao co ID :"+timID);
    }
  }
  void chaymenu(){
    while(true){
    System.out.println("\n===== HE THONG QUAN LY SINH VIEN =====");
            System.out.println("1. Them moi sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Thu nghiem sua ten SV dau tien");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Moi ban chon chuc nang (0-3): ");
        
            System.out.print("\nnhap so lua chon la :");
            int chon = kq.nextInt();
            kq.nextLine();
            switch(chon){
              case 1:
                themsinhvien();
                break;
                case 2:
                  hienthidanhsach();
                  break;
                  case 3:
                    suatensinhvien();
                    break;
                    case 0:
                      System.out.println("tam biet ");
                      System.exit(0);
                      default:
                        System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
  }
}
  
    public static void main(String[] args) {
      Mainstudent app = new Mainstudent();
        app.chaymenu();
    }
}