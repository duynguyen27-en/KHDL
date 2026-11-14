package buoi9;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    ArrayList<ITotNghiep> a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
            File f = new File(tenfile);
            if(f.exists()){
                System.out.println("doc file thanh cong");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String line = sc.nextLine();
                String s[] = line.split(",");
                boolean gt = Boolean.parseBoolean(s[4].trim());
                double diem = Double.parseDouble(s[5].trim());
                if(s[0].trim().equalsIgnoreCase("KHMT")){
                    double toeic = Double.parseDouble(s[6].trim());
                    a.add(new KhoiKhoaHocMayTinh(s[1].trim(),s[2].trim(),s[3].trim(),gt,diem,toeic) );

                }else if(s[0].trim().equalsIgnoreCase("NN")){
                    double tinUngDung = Double.parseDouble(s[6].trim());
                    a.add(new KhoiNgoaiNgu(s[1].trim(),s[2].trim(),s[3].trim(),gt,diem,tinUngDung));
                }

            }
            }else System.out.println("khong doc duoc file");
            
        } catch (Exception e) {
        }
    }
    public void xuatmang(){
        for(ITotNghiep tn :a){
            System.out.println(tn.toString());
        }
    }
    public void ghifile(String tenfile){
    try {
        File f = new File(tenfile);
       
            PrintStream out = new PrintStream(f);
            out.println("========danh sach sv dau tot nghiep========");
           for(ITotNghiep x:a){
            if(x.xetTotNghiep()){
               SinhVien sv = (SinhVien)x;
               out.print(sv.getMa()+","+sv.getTen()+","+sv.getNganh()+","+sv.isGt()+","+sv.getDiemTotNghiep()+",");
               if(x instanceof KhoiKhoaHocMayTinh){
               out.println(((KhoiKhoaHocMayTinh)x).getToeic());
               }else if(x instanceof KhoiNgoaiNgu){
                out.println(((KhoiNgoaiNgu)x).getTinUngDung());
               }
            }
        }  
         out.close();
           System.out.println("ghi file thanh cong");
    } catch (Exception e) {
    }
  }
  public void inDanhSachTotNghiep(){
    System.out.println("=========danh sach tot nghiep========");
    for(ITotNghiep tn :a){
        if(tn.xetTotNghiep()){
            System.out.println(tn.toString());
        }
    }
  }
  public double tinhDiemThiTotNghiepTrungBinh(){
    double tong=0;
    for(ITotNghiep tn:a){
        tong+=tn.getDiemThiTotNghiep();
    }
    return Math.round((tong/a.size())*100.0)/(100.0);
  }

   public ArrayList<ITotNghiep> timkhoa(String name){
     ArrayList<ITotNghiep> b = new ArrayList<>();
     for(ITotNghiep x:a){
        SinhVien sv = (SinhVien) x;
        if(sv.getClass().getSimpleName().equalsIgnoreCase(name)){
            b.add(x);
        }
     }
     return b;
   }
   public void phanLoaiSV(String ten){
    System.out.println("========danh sach sv "+ten+"========");
     ArrayList<ITotNghiep> b = timkhoa(ten);
     for(ITotNghiep x:b){
        System.out.println(x.toString());
     }
   }

   public void timKiemSVDiemTHIMax(){
    ITotNghiep max = a.get(0);
    for(ITotNghiep x:a){
        SinhVien sv = (SinhVien) x;
        SinhVien maxsv = (SinhVien) max;
        if(sv.getDiemTotNghiep()>maxsv.getDiemTotNghiep()){
            max =x;
        }
    }
    System.out.println("========diem thi tot nghiep cao nhat========");
    System.out.println(max.toString());    
   }

   public void timSVDiemThiTuyenQuyetMax(String name){
   
    ArrayList<ITotNghiep> b = timkhoa(name);
    KhoiKhoaHocMayTinh max = null;
    KhoiNgoaiNgu max2 =null;
    for(ITotNghiep x:b){
        if(x instanceof KhoiKhoaHocMayTinh ){
        KhoiKhoaHocMayTinh khmt = (KhoiKhoaHocMayTinh) x;
        if(max==null || khmt.getToeic()> max.getToeic()){
            max = khmt;
        }
    }  else if(x instanceof KhoiNgoaiNgu){
        KhoiNgoaiNgu knn = (KhoiNgoaiNgu) x;
        if(max2==null || knn.getTinUngDung()> max2.getTinUngDung()){
            max2 = knn;
        }
    }
    }
    if(max!=null){
       System.out.println("======== sv khoa "+name+" co diem thi toeic cao nhat========");
        System.out.println(max.toString());
    }
    if(max2!=null){
        System.out.println("======== sv khoa "+name+" co diem thi tin ung dung cao nhat========");
        System.out.println(max2.toString());
    }

   }



    public void output(){
        System.out.println("======danh sach=====");
        xuatmang();
        ghifile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi9\\danhsach_hocbong.txt");
        inDanhSachTotNghiep();
        System.out.println("diem thi tot nghiep trung binh la :"+tinhDiemThiTotNghiepTrungBinh());
        phanLoaiSV("KhoiKhoaHocMayTinh");
        phanLoaiSV("KhoiNgoaiNgu");
        timKiemSVDiemTHIMax();
        timSVDiemThiTuyenQuyetMax("KhoiKhoaHocMayTinh");
        timSVDiemThiTuyenQuyetMax("KhoiNgoaiNgu");
        
    }


    public static void main(String[]args){
        DanhSachSinhVien dd = new DanhSachSinhVien();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi9\\danhsach.txt");
        dd.output();
    }

}
