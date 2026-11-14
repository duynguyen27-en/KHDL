package buoi8;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class DanhSachHoaDon {
    JFrame jf = new JFrame();
    ArrayList<HoaDon> a = new ArrayList<>();
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if(f.exists()){
                System.out.println("doc File thanh cong");
                Scanner sc = new Scanner(f);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[] = line.split(",");
                    int ngay = Integer.parseInt(s[3].trim());
                    int thang=Integer.parseInt(s[4].trim());
                    int nam=Integer.parseInt(s[5].trim());
                    NgayHD ngayHD = new NgayHD(ngay,thang,nam);
                    double gia = Double.parseDouble(s[6].trim());
                    if(s[0].trim().equalsIgnoreCase("N")){
                        int soGio = Integer.parseInt(s[7].trim());
                        a.add(new HoaDonTheoGio(s[1].trim(),s[2].trim(),ngayHD,gia,soGio));
                    }else if(s[0].trim().equalsIgnoreCase("G")){
                        int soNgay=Integer.parseInt(s[7].trim());
                        a.add(new HoaDonTheoNgay(s[1].trim(),s[2].trim(),ngayHD,gia,soNgay));
                    }
                    
                }
            }else System.out.println("file khong ton tai");
            
        } catch (Exception e) {
            
        }
    }
    public void xuatmang(){
        for(HoaDon hd:a){
            System.out.println(hd.toString());
        }
    }
   public boolean them(HoaDon y){
    for(HoaDon x:a){
        if(x.getMaHD().equalsIgnoreCase(y.getMaHD()))
        return false;
    }
    a.add(y);
    return true;
   }
   public HoaDon them1HoaDonMoi(){

    HoaDon hd=null;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap thong tin hoa don moi :");
    String line = sc.nextLine();
                    String s[] = line.split(",");
                    int ngay = Integer.parseInt(s[3].trim());
                    int thang=Integer.parseInt(s[4].trim());
                    int nam=Integer.parseInt(s[5].trim());
                    NgayHD ngayHD = new NgayHD(ngay,thang,nam);
                    double gia = Double.parseDouble(s[6].trim());
                    if(s[0].trim().equalsIgnoreCase("N")){
                        int soGio = Integer.parseInt(s[7].trim());
                      hd= new HoaDonTheoGio(s[1].trim(),s[2].trim(),ngayHD,gia,soGio);
                    }else if(s[0].trim().equalsIgnoreCase("G")){
                        int soNgay=Integer.parseInt(s[7].trim());
                        hd = new HoaDonTheoNgay(s[1].trim(),s[2].trim(),ngayHD,gia,soNgay);
                    }
                    return hd;
   }
   public void themHD(){
    HoaDon hd = them1HoaDonMoi();
    if(them(hd)){
        System.out.println("them thanh cong");
        xuatmang();
    }else{
        System.out.println("ma hoa don da ton tai");
    }
   }
   public void timKiemHoaDnTheoMa(){
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap ma can tim kiem :");
    String ma = sc.nextLine();
    for(HoaDon hd:a){
        if(hd.getMaHD().equalsIgnoreCase(ma)){
            System.out.println("tim kiem thanh cong");
            System.out.println(hd.toString());
            return ;
            
        }
    }
    System.out.println("khong tim thay");
   }
   public boolean xoaHD(String ma){
    for(int i=0;i<a.size();i++){
        if(a.get(i).getMaHD().equalsIgnoreCase(ma)){
            a.remove(i);
            return true;
        }
    }
    return false;
   }
   public void xoaMotHoaDonTheoMa(){
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap ma ca xoa :");
    String ma = sc.nextLine();
    if(xoaHD(ma)){
        System.out.println("xoa thanh cong");
        xuatmang();
    }else{
        System.out.println("xoa that bai");
    }
   }
   public double tinhTTT(){
    double tong=0;
    for(HoaDon hd:a){
        tong+=hd.tinhTien();
    }
    return Math.round(tong*100.0)/(100.0);
   }
   public double tongTienMotNgayNaoDo(NgayHD ngayHD){
    double tong =0;
    for(HoaDon hd:a){
        if(hd.getNgayHD().getNgay()== ngayHD.getNgay()&&
           hd.getNgayHD().getThang()== ngayHD.getThang()&&
            hd.getNgayHD().getNam() == ngayHD.getNam()){
                tong+=hd.tinhTien();
            }
    }
    return Math.round(tong*100.0)/(100.0);
   }
   public double tongTienMotThangNaoDo(int thang){
    double tong=0;
    for(HoaDon hd:a){
        if(hd.getNgayHD().getThang()==thang){
            tong+=hd.tinhTien();
        }
    }
    return Math.round(tong*100.0)/(100.0);
   }
  
    public void timNgayHDMax(){
        NgayHD max = a.get(0).getNgayHD();
        double tienmax =tongTienMotNgayNaoDo(max) ;
        for(HoaDon hd:a){
            double tien = tongTienMotNgayNaoDo(hd.getNgayHD());
            if(tien>tienmax){
                max = hd.getNgayHD();
                tienmax = tien;
            }
        }
        System.out.println("cac hoa don co tong tien lon nhat la :"+tienmax+" va ngay HD la "+max);
    }
    public void tinhTonhHoaDonTungNgay(){
       ArrayList<String> b = new ArrayList<>();
       for(HoaDon hd:a){
        String ngay = hd.getNgayHD().toString();
        if(!b.contains(ngay)){
            double tong = tongTienMotNgayNaoDo(hd.getNgayHD());
           
            System.out.println("tong tien hoa don ngay "+ngay+"la : "+tong);
            b.add(ngay);
        }
       }
        
    }
     public void tinhTonhHoaDonTungThang(){
        ArrayList<Integer> b = new ArrayList<>();
        for(HoaDon hd:a){
            int thang = hd.getNgayHD().getThang();
            if(!b.contains(thang)){
                double tong = tongTienMotThangNaoDo(thang);
                System.out.println("tong tien hoa don thang "+thang+"la : "+tong);
                b.add(thang);
            }
        }
    }

    public void output(){
        System.out.println("==========danh sach hoa don==========");
        xuatmang();
        themHD();
        timKiemHoaDnTheoMa();
         xoaMotHoaDonTheoMa();
        System.out.println("tinh tong tien cac hoa don la : "+tinhTTT());
        timNgayHDMax();
        tinhTonhHoaDonTungNgay();
        tinhTonhHoaDonTungThang();
        
    }
    public static void main(String[] args) {
        DanhSachHoaDon dd = new DanhSachHoaDon();
        dd.docFile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi8\\hoadon.txt");
        dd.output();
    }

}
