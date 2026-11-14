package buoi7;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class danhsachhocsinh {
    ArrayList<hocsinh>  a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
            File f = new File(tenfile);
            if(f.exists()){
                System.out.println(" doc file thanh cong");
                Scanner sc = new Scanner(f);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[]= line.split(",");
                    int ngay = Integer.parseInt(s[3].trim());
                     int thang = Integer.parseInt(s[4].trim());
                      int nam = Integer.parseInt(s[5].trim());
                      ngaysinh n = new ngaysinh(ngay,thang,nam);
                      boolean gt = Boolean.parseBoolean(s[6].trim());
                      double nguvan = Double.parseDouble(s[8].trim());
                      double toan = Double.parseDouble(s[9].trim());
                      if(s[0].trim().equals("C")){
                        double dialy = Double.parseDouble(s[10].trim());
                        a.add(new khoiC(s[1],s[2],n,gt,s[7],nguvan,toan,dialy));
                      }else if(s[0].trim().equals("D")){
                        double ngoaingu = Double.parseDouble(s[10].trim());
                        a.add(new khoiD(s[1],s[2],n,gt,s[7],nguvan,toan,ngoaingu));
                      }   

                }
            } else System.out.println(" file khong ton tai");
            
        } catch (Exception e) {
            System.out.println("loi ");
        }
    }
    public void xuatmang(){
        for(hocsinh hs:a){
            System.out.println(hs.toString());
        }
    }
    public void lieke(ArrayList<hocsinh> b,String khoi){
        System.out.println("========danh sach hoc sinh "+khoi+"========");
        for(hocsinh hs:b){
          System.out.println(hs.toString());
        }
    }
    public ArrayList<hocsinh> xeptheotungkhoi( String khoi){
        ArrayList<hocsinh> b = new ArrayList<>();
        for(hocsinh hs:a){
            if(hs.getClass().getSimpleName().equalsIgnoreCase(khoi)){
                b.add(hs);
            }
        }
        return b;
    }
  public boolean them( hocsinh y){
    for(hocsinh x:a){
        if(x.getmahs().equalsIgnoreCase(y.getmahs())){
            System.out.println("trung");
            return false;
        }
    }
    a.add(y);
    return true;
   
  }
  public hocsinh nhap1hocsinh(){
    hocsinh x=null;
    Scanner sc = new Scanner(System.in);
    System.out.println("=========== nhap 1 hoc sinh ===========");
    String line = sc.nextLine();
                    String s[]= line.split(",");
                    int ngay = Integer.parseInt(s[3].trim());
                     int thang = Integer.parseInt(s[4].trim());
                      int nam = Integer.parseInt(s[5].trim());
                      ngaysinh n = new ngaysinh(ngay,thang,nam);
                      boolean gt = Boolean.parseBoolean(s[6].trim());
                      double nguvan = Double.parseDouble(s[8].trim());
                      double toan = Double.parseDouble(s[9].trim());
                      if(s[0].trim().equals("C")){
                        double dialy = Double.parseDouble(s[10].trim());
                        x=new khoiC(s[1],s[2],n,gt,s[7],nguvan,toan,dialy);
                      }else if(s[0].trim().equals("D")){
                        double ngoaingu = Double.parseDouble(s[10].trim());
                        x=new khoiD(s[1],s[2],n,gt,s[7],nguvan,toan,ngoaingu);
                      } 
                 return x;       
  }
 public void themhocsinh(){
    hocsinh x = nhap1hocsinh();
    if(them(x)){
        lieke(a,"danh sach sau khi them");
    }else{
        System.out.println("them khong thanhf cong vi "+x.getmahs()+"da ton tai");
    }
 }
  public boolean xoatheomahs(String ma){
    for(int i=0;i<a.size();i++){
        if(a.get(i).getmahs().equalsIgnoreCase(ma)){
            a.remove(i);
            return true;
        }
    }
    return false;
  }
  public void xoahocsinh(){
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap ma hoc sinh can xoa la :");
    String ma = sc.nextLine();
    if(xoatheomahs(ma)){
        lieke(a,"danh sách sau khi xoa");
    }else{
        System.out.println("xoa khong thanhf cong vi "+ma+"khong ton tai");
    }
  }


    public double tinhdiemtbchungtungkhoi(ArrayList<hocsinh> ds,String khoi){
        if(ds.isEmpty()) return 0.0;
        System.out.println("=====diem trung binh chung "+khoi+"=======");
      double tong =0;
      for(hocsinh hs:ds){
        tong+=hs.tinhDTB();
      }
      return Math.round(tong/ds.size()*100.0)/100.0;
    }
    public void xacdinhvithutungkhoi(ArrayList<hocsinh> ds,String khoi){
        System.out.println("=========xac dinh vi thu tung"+khoi+"========");
        for(hocsinh hs1:ds){
            int vithu=0;
            for(hocsinh hs2:ds){
                if(hs1.tinhDTB()<hs2.tinhDTB()){
                     vithu++;
                }
            }
            System.out.println(hs1.gethoten()+"-->"+hs1.tinhDTB()+"-->"+(vithu+1)+"");
        }
        
    }
    public void output(){
        System.out.println("========danh sach cac hs=======");
       xuatmang();
       lieke(xeptheotungkhoi("khoiC"), "khoiC");
       lieke(xeptheotungkhoi("khoiD"), "khoiD");
          themhocsinh();
          xoahocsinh();
    //    System.out.println("diem TBC khoi C :"+tinhdiemtbchungtungkhoi(xeptheotungkhoi("khoiC"),"khoiC"));
    //    System.out.println("diem TBC khoi D :"+tinhdiemtbchungtungkhoi(xeptheotungkhoi("khoiD"),"khoiD"));
    //    xacdinhvithutungkhoi(xeptheotungkhoi("khoiC"),"khoiC");
    //    xacdinhvithutungkhoi(xeptheotungkhoi("khoiD"),"khoiD");
    }

    public static void main(String[] args) {
        danhsachhocsinh d = new danhsachhocsinh();
        d.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi7\\hocsinh.txt");
        d.output();
    }
}
