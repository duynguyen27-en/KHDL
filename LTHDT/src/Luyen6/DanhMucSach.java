
package Luyen6;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhMucSach {
    ArrayList<DanhMuc> a = new ArrayList<>();
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
                  NamXB n = new NamXB(ngay, thang, nam);
                  int soTrang = Integer.parseInt(s[7].trim());
                  double giaBan = Double.parseDouble(s[8].trim());
                  int soLuong = Integer.parseInt(s[9].trim());
                  if(s[0].trim().equalsIgnoreCase("SGK")){
                      a.add(new SachGiaoKhoa(s[1].trim(),s[2].trim(),n,s[6].trim(),soTrang,giaBan,soLuong,s[10].trim()));
                  } else if(s[0].trim().equalsIgnoreCase("TT")){
                      a.add(new tieuThuyet(s[1].trim(),s[2].trim(),n,s[6].trim(),soTrang,giaBan,soLuong,s[10].trim()));
                  }
              }
          }  
            
        } catch (Exception e) {
        }
    }
    public void xuatmang(){
        for(DanhMuc dm:a){
            System.out.println(dm.toString());
        }
    }
    public ArrayList<DanhMuc> getA(){
        return this.a;
    }
    public String thongKe(){
        double loai1=0;
        double loai2=0;
        for(DanhMuc dm:a){
            if(dm instanceof SachGiaoKhoa){
                loai1++;
            }else {
                loai2++;
            }
        }
        return "Thống Kê Số Lượng Sách"+
                ""+
                "Sách Giáo Khoa Là :"+loai1+
                ""+
                " Tiểu Thuyết La :"+loai2 ;
    }
    public DanhMuc giaBansTTMax(){
       
          DanhMuc Max = a.get(0);
        for(DanhMuc dm:a){
            if(dm instanceof tieuThuyet){
                DanhMuc Max1 = a.get(0);
                double giaMax = Max1.getGiaBan();
                if(dm.getGiaBan()>giaMax){
                    Max1=dm;
                    giaMax = dm.getGiaBan();
                    Max = Max1;
                }
            }
        }
        return Max; 
    }
    public DanhMuc sachThanhTienMax(){
        DanhMuc max = a.get(0);
        double tt = max.tinhThanhTien();
        for(DanhMuc dm:a){
            if(dm.tinhThanhTien()>tt){
                max = dm;
                tt = dm.tinhThanhTien();
            }
        }
        return max;
    }
    public double TongThanhTien(){
        double tong =0;
        for(DanhMuc dm:a){
            tong+=dm.tinhThanhTien();
        }
        return tong;
    }
 public void them(DanhMuc x){
    
     a.add(x);
 }
    
    
    public void output(){
        xuatmang();
    }
    
    
    
    public static void main(String[] args) {
        DanhMucSach dd = new DanhMucSach();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\Luyen6\\danhmuc.txt");
        dd.output();
        
    }
    
}
