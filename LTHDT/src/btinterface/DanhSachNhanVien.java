package btinterface;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVien {
    ArrayList<ITienLuong> a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
            File f = new File(tenfile);
            if(f.exists()){
                System.out.println("doc file thanh cong");
                Scanner sc = new Scanner(f);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[] = line.split(",");
                    double luong = Double.parseDouble(s[3].trim());
                    if(s[0].trim().equalsIgnoreCase("VP")){
                        int soNgayCong = Integer.parseInt(s[4].trim());
                        a.add(new NhanVienVanPhong(s[1].trim(),s[2].trim(),luong,soNgayCong));
                        
                    }else if(s[0].trim().equalsIgnoreCase("KD")){
                        double doanhSo = Double.parseDouble(s[4].trim());
                        a.add(new NhanVienKinhDoanh(s[1].trim(),s[2].trim(),luong,doanhSo));
                    }
                }
            }

            
        } catch (Exception e) {
        }
    }
    public void xuatmang(){
        for(ITienLuong x:a){
            System.out.println(x.toString());
        }
    }
  public void ghiFileNhanViennhanThuong(String tenfile){
    try {
        File f = new File(tenfile);
            System.out.println("ghi file thanh cong");
          PrintStream out = new PrintStream(f);
            out.println("===danh sach nhan vien nhan thuong===");
            for(ITienLuong x:a){
                if(x.kiemTraKhenThuong()){
                    NhanVien nv = (NhanVien)x;
                    out.print(nv.getMaNV()+","+nv.getTen()+","+nv.getLuongCoBan()+",");
                    if(x instanceof NhanVienVanPhong){
                        out.println(((NhanVienVanPhong)x).getSoNgayCong());
                    }else if(x instanceof NhanVienKinhDoanh){
                        out.println(((NhanVienKinhDoanh)x).getDoanhSoBanHang());
                    }
                } 
            
            out.close();
        }
        
    } catch (Exception e) {
    }
  }


    public void output(){
        System.out.println("======danh sach=======");
        xuatmang();
        ghiFileNhanViennhanThuong("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\btinterface\\nhanviennhanthuong.txt");
    }


    public static void main(String[] args) {
            DanhSachNhanVien a = new DanhSachNhanVien();
        a.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\btinterface\\nhanvien.txt");
        a.output();
    }

}
