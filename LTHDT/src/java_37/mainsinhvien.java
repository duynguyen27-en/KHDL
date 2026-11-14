package java_37;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class mainsinhvien {
    ArrayList<sinhvien> a= new ArrayList<>();
  public void docfile(String tenfile){
    try {
        File f = new File(tenfile);
        if(f.exists()){
            System.out.println("doc File thanh cong");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String line = sc.nextLine();
                String s[]= line.split(",");
                String masv = s[0].trim();
                String hoten = s[1].trim();
                int ngay = Integer.parseInt(s[2].trim());
                int thang = Integer.parseInt(s[3].trim());
                int nam = Integer.parseInt(s[4].trim());
                ngaysinh n = new ngaysinh(ngay,thang,nam);
                double dtb = Double.parseDouble(s[5].trim());
                String tenlop = s[6].trim();
                String tenkhoa = s[7].trim();
                lop l = new lop(tenlop,tenkhoa);
                sinhvien sv = new sinhvien(masv,hoten,n,dtb,l);
                a.add(sv);
            }
        }else System.out.print("File khong ton tai");
        
    } catch (Exception e) {
    }
  }
  public void xuatmang(){
    for(int i=0;i<a.size();i++){
        System.out.println(a.get(i).toString());
    }
  }
 public void tenkhoa(){
    System.out.println("======Danh Sach Ten Khoa======");
    for(int i=0;i<a.size();i++){
        System.out.println("sinh vien "+a.get(i).gethoten()+" thuoc khoa : "+a.get(i).getlop().gettenkhoa());
    }
 }
 public void daukhong(){
    System.out.println("=======Danh Sach Dau Truot=======");
    for(int i=0;i<a.size();i++){
        if(a.get(i).getdtb()>=5){
            System.out.println(a.get(i).toString()+"--> hoc sinh dau");
        }else{
            System.out.println(a.get(i).toString()+"--> hoc sinh truot");
        }
    }
 }
 public void ngaysinhtrung(){
    System.out.println("======Danh Sach Ngay Sinh Trung======");
    sinhvien ngay1 = a.get(0);
    for(int i=1;i<a.size();i++){
        if(a.get(i).ngaysinhtrungk(ngay1)){
            System.out.println("sinh vien "+a.get(i).gethoten()+" co ngay sinh voi sinh vien "+ngay1.gethoten());
        }
    }
 }
  public void output(){
    System.out.println("======DanhSachSinhVien========");
    xuatmang();
    tenkhoa();
    daukhong();
    ngaysinhtrung();

  }
    public static void main(String[] args) {
        mainsinhvien dd = new mainsinhvien();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\java_37\\sinhvien.txt");
        dd.output();

        
    }

}
