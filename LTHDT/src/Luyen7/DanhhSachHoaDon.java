
package Luyen7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhhSachHoaDon {
    ArrayList<HoaDon> a = new ArrayList<>();
    public void docfile(String tenfile){
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
                 NgayHD n = new NgayHD(ngay, thang, nam);
                 double donGia = Double.parseDouble(s[6].trim());
                 if(s[0].trim().equalsIgnoreCase("TG")){
                     int soGioThue = Integer.parseInt(s[7].trim());
                     a.add(new HoaDonTheoGio(s[1].trim(),s[2].trim(),n,donGia,soGioThue));
                 } else  if(s[0].trim().equalsIgnoreCase("TN")){
                     int soNgayThue = Integer.parseInt(s[7].trim());
                     a.add(new HoaDonTheoNgay(s[1].trim(),s[2].trim(),n,donGia,soNgayThue));
                 }
             }  
           }
        } catch (Exception e) {
        }
    }
    
    public void xuatmmang(){
        for(HoaDon hd:a){
            System.out.println(hd.toString());
        }
    }
    public ArrayList<HoaDon> getA(){
        return this.a;
    }
    public void them(HoaDon y){
        a.add(y);
    }
    public HoaDon timKiem(String ma){
        for(HoaDon hd:a){
            if(hd.getMaHD().equalsIgnoreCase(ma)){
                return hd;
                
            }
        }
        return null;
    }
    public void xoa(String ma){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getMaHD().equalsIgnoreCase(ma)){
                a.remove(i);
                return;
            }
        }
    }
    public double tinhTongTien(){
        double tong=0;
        for(HoaDon hd:a){
            tong+=hd.tinhThanhTien();
        }
        return Math.round(tong*100.0)/(100.0);
    }
    public String ngayTongTienLonNhat(){
          String ngay = a.get(0).getMaHD().toString();
          Double max = a.get(0).tinhThanhTien();
        for(HoaDon hd:a){
            if(hd.tinhThanhTien()>max){
                max = hd.tinhThanhTien();
                ngay = hd.getNgayHD().toString();
            }
        }
        return "Ngày Có Tổng Tiền Lớn Nhất La :"+ngay;
    }
    
    
    
    public void output(){
        xuatmmang();
    }
    
    public static void main(String[] args) {
        DanhhSachHoaDon dd = new DanhhSachHoaDon();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\Luyen7\\hoadon.txt");
        dd.output();
    }
    
}
