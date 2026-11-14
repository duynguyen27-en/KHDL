
package Luyen4;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLySach {
    ArrayList<ISach> a = new ArrayList<>();
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
                    NgayNhap n = new NgayNhap(ngay, thang, nam);
                    double donGia = Double.parseDouble(s[6].trim());
                     int soLuong = Integer.parseInt(s[7].trim());
                  if(s[0].trim().equalsIgnoreCase("SGK")){
                       boolean tinhTrang = Boolean.parseBoolean(s[8].trim());
                     a.add(new SachGiaoKhoa(s[1].trim(),s[2].trim(), n, donGia, soLuong, tinhTrang));
                  } else  if(s[0].trim().equalsIgnoreCase("STK")){
                      double thue = Double.parseDouble(s[8].trim());
                     a.add(new SachThamKhao(s[1].trim(),s[2].trim(), n, donGia, soLuong, thue));
                  }
              } 
           }
       } catch (Exception e) {
       }
   } 
   public void xuatmang(){
       for(ISach s :a){
           System.out.println(s.toString());
       }
   }
   public ArrayList<ISach> getA(){
       return this.a;
   }
   public ArrayList<ISach> timSach(){
       ArrayList<ISach> x = new ArrayList<>();
       for(ISach s:a){
           if(s.tinhThanhTien()>500000){
               x.add(s);
           }
       }
       return x;
   }
   public int tinhTongSoLuong(){
       int tong=0;
       for(ISach s:a){
           Sach y = (Sach)s;
           tong+=y.getSoLuong();
       }
       return tong;
   }
   public void sapxep(){
       Collections.sort(a, new Comparator<ISach>(){
           @Override
           public int compare(ISach o1, ISach o2) {
               return Double.compare(o1.tinhThanhTien(), o2.tinhThanhTien()); 
           }
       });
   }
   public void output(){
       xuatmang();
   }
    
    
    
    public static void main(String[] args) {
        QuanLySach dd = new QuanLySach();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\Luyen4\\sach.txt");
        dd.output();
    }
    
}
