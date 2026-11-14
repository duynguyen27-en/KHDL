 package java_35;
 import java.util.ArrayList;
 import java.util.Scanner;
 public class mainsach {
     ArrayList<sach> a =new ArrayList<>();
     Scanner sc = new Scanner(System.in);
     String tensach,tentacgia;
     double giaban;
     int namsanxuat,ngay,thang,nam;
    
     void input(){
        System.out.print("nhap ten sach :");
        tensach = sc.nextLine();
        System.out.print("gia ban :");
        giaban = sc.nextDouble();
        System.out.print("nam san xuat :");
        namsanxuat = sc.nextInt();
        sc.nextLine();
        System.out.print("ten tac gia :");
        tentacgia = sc.nextLine();
        System.out.print("ngay sinh :");
        ngay = sc.nextInt();
        System.out.print("thang sinh :");
        thang = sc.nextInt();
        System.out.print("nam sinh :");
        nam = sc.nextInt();
        sc.nextLine();
        ngay ngaysinh = new ngay(ngay,thang,nam);
        tacgia tg = new tacgia( tentacgia,ngaysinh);
        sach s = new sach(tensach,giaban,namsanxuat,tg);
         a.add(s);
     }
     void xuatmang(){
        System.out.println("=====ten sach=====");
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
     }
    
     void tesnamsuatban(){
        if(a.size()<2){
            System.out.println("so luong sach khong du");
            return;
        }
    sach cuon1 = a.get(0);
    sach cuon2 = a.get(1);
    boolean trungNam = cuon1.kiemtracungnamxuatban(cuon2);
    System.out.println("Sach [" + cuon1.gettensach() + "] va Sach [" + cuon2.gettensach() + "]");
        System.out.println("-> Co xuat ban cung nam khong? Ket qua: " + trungNam);

     }
  
void  giasaukhigiam(double x){
    double gia =0;
    for(int i=0;i<a.size();i++){
    gia = a.get(i).getgiaban()*(1-x/100);
     System.out.println("gia sau khi giam sach "+a.get(i).gettensach()+" la :"+Math.round(gia*100.0)/(100.0));
    }
 }

  void output(){
    
    while(true){
        System.out.println("================Danh sach==============");
        System.out.println("1.nhap cuon sach");
        System.out.println("2.In thong tin cac cuon sach");
        System.out.println("3.kiem tra nam san xuat co trong danh sach khong");
        System.out.println("4.giam gia x phan tram");
        System.out.println("5.thoat");
        System.out.print("nhap lua chon :");
        int chon = sc.nextInt();
        sc.nextLine();
        switch(chon){
            case 1:
                input();
                break;
                case 2:
                    xuatmang();
                    break;
                    case 3:      
                        tesnamsuatban();
                        break;
                        case 4:
                            System.out.print("nhap giam gia :");
                                   double x = sc.nextInt();
                                  giasaukhigiam(x);
                                   break;
                                   case 5:
                                    System.exit(0);
                                    break;
                                    default:
                                        System.out.println("loi!");
        }
        
    }

  }
    public static void main(String[] args){
        mainsach main = new mainsach();
        main.output();
    }

}