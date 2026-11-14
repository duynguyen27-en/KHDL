package buoi5bt;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class mangsinhvien {
    ArrayList<sinhvien> a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
            File f= new File(tenfile);
            if(f.exists()){
                System.out.println("doc file thanh cong");
                Scanner sc = new Scanner(f);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[] = line.split(",");
                    boolean gt = Boolean.parseBoolean(s[2].trim());
                    double mon1 = Double.parseDouble(s[3].trim());
                    double mon2 = Double.parseDouble(s[4].trim());
                    if(s.length==6){
                        double mon3 = Double.parseDouble(s[5].trim());
                        a.add(new cntt(s[0].trim(),s[1].trim(),gt,mon1,mon2,mon3));
                       
                    }
                    else if(s.length==5){
                        a.add(new kinhte(s[0].trim(),s[1].trim(),gt,mon1,mon2));
                    }
                }
            } else System.out.println("file khong ton tai");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void xuatmang(){
        for(sinhvien sv:a){
            System.out.println(sv.toString());
        }
    }
  public void lietke(ArrayList<sinhvien> b ,String thongbao){
    System.out.println(thongbao);
    for(sinhvien sv :b){
        System.out.println(sv.toString());
    }
  }
  public ArrayList<sinhvien> lietkesinhvientungnganh(String tennganh){
    ArrayList<sinhvien> b = new ArrayList<>();
    for(sinhvien sv:a){
        if(sv.getClass().getSimpleName().equalsIgnoreCase(tennganh)){
            b.add(sv);
            
        }
    }
    return b;
  }
  public double tinhdiemtbchung(){
    double sum=0;
    for(sinhvien sv:a){
        sum+=sv.tinhDTB();
    }
    return Math.round(sum/a.size() *100.0)/100.0;
  }
public double tinhdiemtbcntt(){
    ArrayList<sinhvien> dscntt =  lietkesinhvientungnganh("cntt");
    double tong =0;
    for(sinhvien sv :dscntt){
        tong+=sv.tinhDTB();
    }
    return Math.round(tong/dscntt.size()*100.0)/100.0;
}
public double tinhdiemtbbkinhte(){
    ArrayList<sinhvien> dskte =  lietkesinhvientungnganh("kinhte");
    double tong =0;
    for(sinhvien sv :dskte){
        tong+=sv.tinhDTB();
    }
    return Math.round(tong/dskte.size()*100.0)/100.0;
}
public int demsosvgioikinhte(){
    ArrayList<sinhvien> dskinhte = lietkesinhvientungnganh("kinhte");
    int dem=0;
    for(sinhvien sv :dskinhte){
        if(sv.xeploai().equals("gioi")){
            dem++;
        }
        
    }
    return dem;
}
public void xacdinhvithu(ArrayList<sinhvien> dsn,String tends){
    System.out.println("=========danh sach vi thu "+tends+"========");
    for(sinhvien sv:dsn){
        int vithu=0;
        for(sinhvien sv1:dsn){
            if(sv.tinhDTB()<sv1.tinhDTB()){
                vithu++;
            }
        }
         System.out.println(sv.gethoten()+"-->"+sv.tinhDTB()+"-->"+(vithu+1));
    }
    
}
public double diemtbtheogt(boolean gt){
    double tong =0;
    int dem=0;
    for(sinhvien sv:a){
        if(sv.getgt()==gt){
            tong+=sv.tinhDTB();
            dem++;
        }
    }
    return Math.round(tong/dem*100.0)/100.0;

}
public int demsvtungnganh(ArrayList<sinhvien> dssv,String tennganh)
{
     System.out.println("=========so sinh vien "+tennganh+"========");
    int dem=0;
    for(sinhvien sv:dssv){
            dem++;
    }
    return dem;
}
public void lietkesinhvienhocbong(ArrayList<sinhvien> dssv,String tennganh){
     System.out.println("=========danh sach sinh vien hoc bong "+tennganh+"========");
     for(sinhvien sv:dssv){
        if(sv.tinhDTB()>=8 && sv.monhesohai()>7.5 ){
           
            System.out.println(sv.toString()+"-->hoc bong");
          
     }

}
}

    public void output(){
        System.out.println("=========danh sach sv========");
        xuatmang();
        lietke(lietkesinhvientungnganh("cntt"),"========danh sach sinh vien cntt======== ");
        lietke(lietkesinhvientungnganh("kinhte"),"========danh sach sinh vien kinhte======== ");
        System.out.println("diem tb chung: "+tinhdiemtbchung());
        System.out.println("diem tb cntt: "+tinhdiemtbcntt());
        System.out.println("diem tb kinhte: "+tinhdiemtbbkinhte());
        System.out.println("so sinh vien gioi kinhte: "+demsosvgioikinhte());
      xacdinhvithu(lietkesinhvientungnganh("cntt"),"cntt");
      xacdinhvithu(lietkesinhvientungnganh("kinhte"),"kinhte");
      System.out.println("diem tb nam: "+diemtbtheogt(true));
      System.out.println("diem tb nu: "+diemtbtheogt(false));
      System.out.println("so sinh vien cntt: "+demsvtungnganh(lietkesinhvientungnganh("cntt"),"cntt"));
      System.out.println("so sinh vien kinhte: "+demsvtungnganh(lietkesinhvientungnganh("kinhte"),"kinhte"));
      lietkesinhvienhocbong(lietkesinhvientungnganh("cntt"),"cntt");
      lietkesinhvienhocbong(lietkesinhvientungnganh("kinhte"),"kinhte");



    }
    public static void main(String[] args){
        mangsinhvien dd = new mangsinhvien();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi5bt\\sinhvienbt.txt");
        dd.output();
    }

}
