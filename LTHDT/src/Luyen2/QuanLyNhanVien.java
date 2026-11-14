
package Luyen2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanVien {
    ArrayList<IThue> a = new ArrayList<>();
    
    public void docfile(String tenfile ){
        try {
            File f = new File(tenfile);
            if(f.exists()){
                System.out.println("doc file thanh cong");
                Scanner sc = new Scanner(f);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[] = line.split(",");
                    int ngay = Integer.parseInt(s[3].trim());
                    int thang = Integer.parseInt(s[4].trim());
                    int nam = Integer.parseInt(s[5].trim());
                    NgaySinh n = new NgaySinh(ngay, thang, nam);
                    double luongCB = Double.parseDouble(s[6].trim());
                    if(s[0].trim().equalsIgnoreCase("NVVP")){
                     int soNgayNghi = Integer.parseInt(s[7].trim());   
                     a.add(new NhanVienVanPhong(s[1].trim(),s[2].trim(),n,luongCB,soNgayNghi));
                    } else if(s[0].trim().equalsIgnoreCase("NVKD")){
                     int doanhsoHB = Integer.parseInt(s[7].trim());   
                     a.add(new NhanVienKinhDoanh(s[1].trim(),s[2].trim(),n,luongCB,doanhsoHB));
                    }
                } 
            }
        } catch (Exception e) {
        }
    }
    public void xuatmang(){
        for(IThue nv:a){
            System.out.println(nv.toString());
        }
    }
    public ArrayList<IThue> getA(){
        return this.a;
    }
    public void them(IThue x){
        a.add(x);
    }
    public IThue timKiem(String ma){
        for(IThue nv:a){
            NhanVien x = (NhanVien)nv;
            if(x.getMa().equalsIgnoreCase(ma)){
                return nv;
            }
        }
        return null;
    }
    public void xapxep(){
        Collections.sort(a,new Comparator<IThue>() {
            @Override
            public int compare(IThue o1, IThue o2) {
               return Double.compare(((NhanVien)o2).tinhLuong(),((NhanVien)o1).tinhLuong());
            }
        });
    }
    public String thongKe(){
        int NVVP=0;
        int NVKD=0;
        for(IThue nv:a){
            NhanVien x = (NhanVien)nv;
            if(x instanceof NhanVienVanPhong){
                NVVP++;
            }else if(x instanceof NhanVienKinhDoanh){
                NVKD++;
            }
            
        }
        return "Thống Kê Về Các Nhân Viên"+
                "Nhân Viên Văn Phòng Là :"+NVVP+
                "Nhân Viên Kinh Doanh Là :"+NVKD;
    }
    
    public void output(){
        xuatmang();
    }
    
    
    public static void main(String[] args) {
        QuanLyNhanVien dd = new QuanLyNhanVien();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\Luyen2\\danhsachnhanvien.txt");
        dd.output();
        
    }
    
}
