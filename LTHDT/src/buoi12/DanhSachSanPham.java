package buoi12;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSanPham {
  ArrayList<SanPham> a = new ArrayList<>();

  public void docfile(String tenfile){
    try {
        File f = new File(tenfile);
        if(f.exists()){
            System.out.println("doc file thanh cong");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String line = sc.nextLine();
                String s[] = line.split(",");
                double dongia = Double.parseDouble(s[1].trim());
                 double soluong = Double.parseDouble(s[2].trim());
                 if(s.length==6){
                    int nam = Integer.parseInt(s[4].trim());
                    a.add(new TiVi(s[0].trim(), dongia, soluong, s[3].trim(), nam, s[5].trim()));
                 }else{
                     double ram = Double.parseDouble(s[4].trim());
                     a.add(new MayTinh(s[0].trim(), dongia, soluong, s[3].trim(), ram));

                 }

            }
            
        }else System.out.println("khong thay file");
        
    } catch (Exception e) {
    }
  }
  public void xuatmang(){
    for(SanPham sp:a){
      System.out.println(sp.toString());
    }
  }
  public boolean xoaSanPham(String ma) {
    for (int i = 0; i < a.size(); i++) {
        if (a.get(i).getMaSp().equalsIgnoreCase(ma)) {
            a.remove(i);
            return true; 
        }
    }
    return false; 
}
  public void sapXepTheoChietKhau() {
    Collections.sort(a, new Comparator<SanPham>() {
        @Override
        public int compare(SanPham s1, SanPham s2) {
            // So sánh chiết khấu của s1 và s2
            return Double.compare(s1.tinhChietKhau(), s2.tinhChietKhau());
        }
    });
}
public void hhienThiThongTinChietKhauCao(){
     SanPham max = a.get(0);
     double max1 = a.get(0).tinhChietKhau();
     for(SanPham sp :a){
      if( max1<sp.tinhChietKhau()){
        max1 = sp.tinhChietKhau();
        max=sp;
      }
     }
     System.out.println("======chiet khau cao nhat======");
     System.out.println(max.toString());


  }
public SanPham timKiemSanPham(String ma) {
    for (SanPham sp : a) {
        if (sp.getMaSp().equalsIgnoreCase(ma)) {
            return sp; 
        }
    }
    return null; 
}
  public double tinhTongTienGiamGia(){
    double tong=0;
    for(SanPham sp:a){
      tong+=sp.tinhChietKhau();
    }
    return Math.round(tong*100.0)/(100.0);
  }
  public void timKiemThietBiDieTuBangMa(){
  Scanner sc = new Scanner(System.in);
  System.out.print("nhap ma can tim :");
   String ma = sc.nextLine();

   for(SanPham sp:a){
    if(sp.getMaSp().equalsIgnoreCase(ma)){
      System.out.println("tim thay ");
      System.out.println(sp.toString());
    }
   }

  }
  public void xoaTatCaThongTinBangMa(){
    Scanner sc = new Scanner(System.in);
  System.out.print("nhap ma can xoa :");
   String ma = sc.nextLine();

   for(int i=0;i<a.size();i++){
    if(a.get(i).getMaSp().equalsIgnoreCase(ma)){
      System.out.println("xoa thanh cong");
      a.remove(i);
      break;
    }
    
    
   }
   xuatmang();
  }
  public void sapXepCacThietBiDienTuTangDan(){
    System.out.println("======sap xep=======");
    for(int i=0;i<a.size()-1;i++){
      for(int j=i+1;j<a.size();j++){
        SanPham tam = a.get(i);
        if(a.get(i).tinhChietKhau()> a.get(j).tinhChietKhau()){
          a.set(i,a.get(j));
          a.set(j,tam);
        }
      }
    }
    xuatmang();
  }



  public void output(){
    System.out.println("======danh sach=======");
    xuatmang();
    hhienThiThongTinChietKhauCao();
    System.out.println("tong tien giam gia: "+tinhTongTienGiamGia());
    timKiemThietBiDieTuBangMa();
    xoaTatCaThongTinBangMa();
    sapXepCacThietBiDienTuTangDan();
  }
  


    public static void main(String[] args) {
        DanhSachSanPham dd = new DanhSachSanPham();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi12\\DanhSachSanPham.txt");
        dd.output();

    }

}
