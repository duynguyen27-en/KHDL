package buoi5;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class mangsinhvien {
    ArrayList<sinhvien> a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
            File f = new File(tenfile);
            if(f.exists()){
                System.out.println("doc File thanh cong");
                Scanner sc = new Scanner(f);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[] = line.split(",");
                    
                     String masv = s[0].trim();
                     String hoten = s[1].trim();
                     boolean gt = Boolean.parseBoolean(s[2].trim());
                    if(s.length==6){
                        double java = Double.parseDouble(s[3].trim());
                        double css = Double.parseDouble(s[4].trim());
                        double html = Double.parseDouble(s[5].trim());
                        a.add(new cntt(masv,hoten,gt,java,css,html));
                       
                    } else if(s.length==5){
                         double nlkt = Double.parseDouble(s[3].trim());
                        double makt = Double.parseDouble(s[4].trim());
                        a.add(new kinhte(masv,hoten,gt,nlkt,makt));
                    }
                }
            } else System.out.println("khong tim thay file");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<sinhvien> getA(){
        return this.a;
    }
     public void ghifile(String tenfile){
    try {
        File f = new File(tenfile);
       
            PrintStream out = new PrintStream(f);
            
           for(sinhvien x:a){
               if(x instanceof cntt){
                   out.print(x.getmasv()+","+x.gethoten()+","+x.isgt()+",");
                   out.println(((cntt) x).getjava()+","+((cntt) x).getcss()+","+((cntt) x).gethtml());
               }
                if(x instanceof kinhte){
                   out.print(x.getmasv()+","+x.gethoten()+","+x.isgt()+",");
                   out.println(((kinhte) x).getnlkt()+","+((kinhte) x).getmakt());
               }
            
        }  
         out.close();
           System.out.println("ghi file thanh cong");
    } catch (Exception e) {
    }
  }
    
    public void xuatmang(){
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
    }
    
    public void them(sinhvien y){
        
        a.add(y);
        
    }

    public void lietketheotungnganh(){
        System.out.println("=========danh sach cntt=======");
       for(sinhvien sv :a){
        if(sv instanceof cntt){
            System.out.println(sv.toString());
        }
       }
       System.out.println("=========danh sach kinhte=======");
       for(sinhvien sv:a){
        if(sv instanceof kinhte){
            System.out.println(sv.toString());
        }
       }
       
    }
   public double tinhdiemtbchung(){
    double tong =0;
    for(sinhvien sv :a){
        tong+=sv.tinhDTB();
    }
    double s = tong/a.size();
    return Math.round(s*100.0)/(100.0);

   }
   public double tinhdiemtbcntt(){
    double tong =0;
    int s=0;
    for(sinhvien sv:a){
        if(sv instanceof cntt){
            tong+=sv.tinhDTB();
            s++;
        }
    }
    if (s == 0) {
        return 0.0; 
    }
    double tb = tong/s;
    return Math.round(tb*100.0)/(100.0);

   }
    public double tinhdiemtbkinhte(){
    double tong =0;
    int s=0;
    for(sinhvien sv:a){
        if(sv instanceof kinhte){
            tong+=sv.tinhDTB();
            s++;
        }
    }
    if (s == 0) {
        return 0.0; 
    }
    double tb = tong/s;
    return Math.round(tb*100.0)/(100.0);

   }
   public int demsosinhviengiokinhte( ){
    int dem=0;
    for(sinhvien sv:a){
        if(sv instanceof kinhte && ((kinhte)sv).xeploai().equals("gioi")){
            dem++;
        }
    }
    return dem;
   }
   public void vithutheotungnganh(){
        ArrayList<sinhvien> dscntt = new ArrayList<>();
        ArrayList<sinhvien> dskinhte = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            if(a.get(i) instanceof cntt){
                dscntt.add(a.get(i));

            }else{
                dskinhte.add(a.get(i));
            }
        }
        System.out.println("========vi thu sv cntt========");
        for(sinhvien sv:dscntt){
            int vithu=0;
            for(sinhvien sv2:dscntt){
                if(sv.tinhDTB()<sv2.tinhDTB()){
                   vithu++;
                }
            }
            System.out.println("CNTT-->ho ten:"+sv.gethoten()+"--> DTB: "+sv.tinhDTB()+"--> vi thu:"+(vithu+1)+"");
        }
        System.out.println("========vi thu sv kinhte========");
        for(sinhvien sv:dskinhte){
            int vithu=0;
            for(sinhvien sv2:dskinhte){
                if(sv.tinhDTB()<sv2.tinhDTB()){
                   vithu++;
                }
            }
            System.out.println("KINHTE-->ho ten:"+sv.gethoten()+"--> DTB: "+sv.tinhDTB()+"--> vi thu:"+(vithu+1)+"");
        }
    }
    public double tinhdiemtbtheogioitinh(boolean gt){
        double tong =0;
        int s=0;
        for(sinhvien sv:a){
            if(sv.isgt()== gt){
                tong+=sv.tinhDTB();
                s++;
            }
        }
        if(s==0){
            return 0;
        }
        double tb = tong/s;
        return Math.round(tb*100.0)/(100.0);
        
    }
    public void sosinhviengioitheotungnganh(){
        int dem1=0;
        int dem2=0;
        for(sinhvien sv:a){
            if(sv instanceof cntt ){
                if(sv.xeploai().equals("gioi")){
                    dem1++;
                }
            }else if(sv instanceof kinhte){
                if(sv.xeploai().equals("gioi")){
                    dem2++;
                }
            }
        }
        System.out.println("so sv gioi cntt :"+dem1);
        System.out.println("so sv gioi kinhte :"+dem2);
    }
    public void hocbong(){
        for(sinhvien sv:a){
            if(sv instanceof cntt){
                if(sv.tinhDTB()>=8 && ((cntt)sv).getjava()>=7.5){
                    System.out.println("CNTT--> sv "+sv.gethoten()+"--> DTB: "+sv.tinhDTB()+" được học bổng");
                }
            }else if(sv instanceof kinhte){
                if(sv.tinhDTB()>=8 && ((kinhte)sv).getnlkt()>=7.5){
                    System.out.println("KINHTE--> sv "+sv.gethoten()+"--> DTB: "+sv.tinhDTB()+" được học bổng");
                }
            }
        }
    }
        


    public void output(){
        System.out.println("========danh sach cac sv========");
        xuatmang();
        lietketheotungnganh();
        System.out.println("diem trung binh chung :"+tinhdiemtbchung());
        System.out.println("diem trung binh cntt :"+tinhdiemtbcntt());
        System.out.println("diem trung binh kinhte :"+tinhdiemtbkinhte());
        System.out.println("so sv gioi kinhte :"+demsosinhviengiokinhte());
        vithutheotungnganh();
        System.out.println("diem trung binh nam :"+tinhdiemtbtheogioitinh(true));
        System.out.println("diem trung binh nu :"+tinhdiemtbtheogioitinh(false));
        sosinhviengioitheotungnganh();
        hocbong();
    }
    public static void main(String[] args) {
        mangsinhvien dd = new mangsinhvien();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi5\\sinhvien.txt");
        dd.output();
        

}
}
