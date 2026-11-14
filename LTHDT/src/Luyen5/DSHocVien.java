
package Luyen5;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DSHocVien {
    ArrayList<IHocPhi> a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
           File f = new File(tenfile);
           if(f.exists()){
               System.out.println("Doc File Thanh Cong");
               Scanner sc = new Scanner(f);
               while(sc.hasNext()){
                   String line = sc.nextLine();
                   String s[] = line.split(",");
                   int ngay = Integer.parseInt(s[4].trim());
                   int thang = Integer.parseInt(s[5].trim());
                   int nam = Integer.parseInt(s[6].trim());
                   NgayNhap n = new NgayNhap(ngay, thang, nam);
                   double donGia = Double.parseDouble(s[7].trim());
                   if(s[0].trim().equalsIgnoreCase("HG")){
                      double heSo = Double.parseDouble(s[8].trim()); 
                      a.add(new HocGuitar(s[1].trim(),s[2].trim(),s[3].trim(), n, donGia, heSo));
                   } else if(s[0].trim().equalsIgnoreCase("HP")){
                      double hocPhi = Double.parseDouble(s[8].trim()); 
                      a.add(new HocGuitar(s[1].trim(),s[2].trim(),s[3].trim(), n, donGia, hocPhi));
                   }  
               }
           }
        } catch (Exception e) {
        }
    }
    public void xuatmang(){
        for(IHocPhi hp:a){
            System.out.println(hp.toString());
        }
    }
    public void ghifile(String ghifile){
        try {
            File f = new File(ghifile);
            PrintStream out = new PrintStream(f);
            for(IHocPhi hp:a){
                HocVien x = (HocVien) hp;
                if(x instanceof HocGuitar){
                    out.print(x.getMaHV()+","+x.getTenHV()+","+x.getSoCM()+","+x.getDonGia()+",");
                    out.println(((HocGuitar) x).getHeSo());
                } else  if(x instanceof HocPiano){
                    out.print(x.getMaHV()+","+x.getTenHV()+","+x.getSoCM()+","+x.getDonGia()+",");
                    out.print(((HocPiano) x).getHocPhi());
                } 
            }
        } catch (Exception e) {
        }
    }
    public double tinhTongTien(){
        double tong=0;
        for(IHocPhi hp:a){
            tong+=hp.tinhHocPhi();
        }
        return Math.round(tong*100.0)/(100.0);
    }
    public void xoaDS(){
        System.out.println("Danh Sach Sau Khi Xoa");
        for(int i=0;i<a.size();i++){
            HocVien x = (HocVien)a.get(i);
            if(x.getDonGia()<800){
               a.remove(i);
            }
             
        }
        xuatmang();
    }
    
    
    public void output(){
        xuatmang();
        ghifile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\Luyen5\\ghihocvien.txt");
        System.out.println("Tinh Tong Tien Gitar Va Piano La :"+tinhTongTien());
         xoaDS();
    }
    
    
    
    public static void main(String[] args) {
        DSHocVien dd = new DSHocVien();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\Luyen5\\hocvien.txt");
        dd.output();
       
        
    }
    
}
