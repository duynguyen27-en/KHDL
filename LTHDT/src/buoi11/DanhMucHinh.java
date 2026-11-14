package buoi11;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhMucHinh {
    ArrayList<Hinh>  a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
            File f = new  File(tenfile);
            if(f.exists()){
                System.out.println("doc file thanh cong");
                Scanner sc = new Scanner(f);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[]= line.split(",");
                    double Canha= Double.parseDouble(s[0].trim());
                    double Canhb = Double.parseDouble(s[1].trim());
                    if(s.length==2){
                        a.add(new HinhChuNhat(Canha,Canhb));
                    } else if(s.length==3){
                        double h = Double.parseDouble(s[2].trim());
                        a.add(new HinhHopChuNhat(Canha,Canhb,h));
                    }
                }
            }
            
            
        } catch (Exception e) {
        }
    }

    public void xuatmang(){
        for(Hinh h:a){
            System.out.println(h.toString());
        }
    }
    public boolean them(Hinh y){

        for(Hinh x: a){
            if(x.equals(y)){
                return false;
            }
        }
        a.add(y);
        return true;

    }

    public void themHinh(){
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("nhap (a,b) hoac (a,b,h) de nhap vao hinh :");
        String line  = sc.nextLine();
                    String s[]= line.split(",");
                    double Canha= Double.parseDouble(s[0].trim());
                    double Canhb = Double.parseDouble(s[1].trim());
                    if(s.length==2){
                        a.add(new HinhChuNhat(Canha,Canhb));
                        System.out.println("nhap thanh cong");
                    } else if(s.length==3){
                        double h = Double.parseDouble(s[2].trim());
                        a.add(new HinhHopChuNhat(Canha,Canhb,h));
                     System.out.println("nhap thanh cong");
                    }else{
                        System.out.println("sai du lieu");
                    }

                   System.out.println("==========danh muc sao khi them=========");
                   xuatmang();
                   sc.close();

    }
    public ArrayList<Hinh>  tachHinh(String ten){
        ArrayList<Hinh> x = new ArrayList<>();
        for(Hinh y :a){
            if(y.getClass().getSimpleName().equalsIgnoreCase(ten)){
                x.add(y);
            }
        }
        return x;

    }

    public void tachTheoLoaiHinh(ArrayList<Hinh> y , String ten){
        System.out.println("======= loai hinh "+ten+"=======");
        for(Hinh x:y){
            System.out.println(x.toString());
        }
    }

    public void timHinhHopMax(){
      ArrayList<Hinh> hhcn = tachHinh("HinhHopChuNhat");
      HinhHopChuNhat hhcn1 = (HinhHopChuNhat) hhcn.get(0);
      double max = hhcn1.tinhChuVi();
      for(Hinh y:hhcn){
        if(y.tinhChuVi()>max){
            max = y.tinhChuVi();
            hhcn1 = (HinhHopChuNhat)y;
        }
      }
      System.out.println("hinh hop chu nhat co chu vi lon nhat la:"+max);
      System.out.println("========hinh hop chu nhat lon nhat========");
      System.out.println(hhcn1.toString());
      
    }
    public void output(){
        System.out.println("=======danh muc hinh=======");
        xuatmang();
        themHinh();
        tachTheoLoaiHinh(tachHinh("HinhChuNhat"), "HinhChuNhat");
        tachTheoLoaiHinh(tachHinh("HinhHopChuNhat"), "HinhHopChuNhat");
        timHinhHopMax();
    }

    public static void main(String[] args) {
        
        DanhMucHinh dd = new DanhMucHinh();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi11\\hinh.txt");
        dd.output();

        
        
    }



}
