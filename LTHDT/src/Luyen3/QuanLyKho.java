
package Luyen3;

import java.io.File;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyKho {
    ArrayList<IKho> a = new ArrayList<>();
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
                    double giaGoc = Double.parseDouble(s[6].trim());
                    if(s[0].trim().equalsIgnoreCase("HDT")){
                        int thoiGiaBH = Integer.parseInt(s[7].trim());
                        a.add(new HangDienTu(s[1].trim(),s[2].trim(), n, giaGoc, thoiGiaBH));
                    }else if(s[0].trim().equalsIgnoreCase("HGD")){
                        
                        a.add(new HangGiaDung(s[1].trim(),s[2].trim(), n, giaGoc,s[7].trim()));
                    }
                }
            }
            
        } catch (Exception e) {
        }
    }
    public void xuatmang(){
        for(IKho x:a){
            System.out.println(x.toString());
        }
    }
    public ArrayList<IKho> getA(){
        return this.a;
    }
    public ArrayList<IKho> timSanPham(double x,double y){
        ArrayList<IKho> n= new ArrayList<>();
        for(IKho nv:a){
            SanPham sp = (SanPham) nv;
            if(sp.getGiaGoc()>=x && sp.getGiaGoc()<=y){
                n.add(nv);
            }
            
         }
        return n;
    }
    
    public String tinhTongGiaBan(){
        long  tong=0;
        for(IKho nv:a){
            tong+=nv.tinhGiaBan();
        }
        
        return "Tổng Giá Trị Toàn Bộ Kho Hang"+
                "Tổng Giá Bán Sản Phẩm Là :"+tong;
    }
    public void sapXepTheoChuCai(){
        Collections.sort(a,new Comparator<IKho>(){
            @Override
            public int compare(IKho o1, IKho o2) {
                return ((SanPham)o1).getHoTen().compareToIgnoreCase(((SanPham)o2).getHoTen());
               
            }
        });
        
    
    }
    
    
    public void output(){
        xuatmang();
    }
    
    
    public static void main(String[] args) {
        QuanLyKho dd = new QuanLyKho();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\Luyen3\\sampham.txt");
        dd.output();
        
    }
    
}
