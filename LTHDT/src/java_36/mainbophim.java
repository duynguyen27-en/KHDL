package java_36;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class mainbophim {
     ArrayList<bophim> a = new ArrayList<>();
   public void docfile(String tenfile){
    try {
        File f =new File(tenfile);
        if(f.exists()){
            System.out.println("doc file thanh cong");
            Scanner sc = new Scanner(f);
           while(sc.hasNext()){
            String line = sc.nextLine();
            String s[] = line.split(",");
            String tenphim = s[0].trim();
            int namsanxuat = Integer.parseInt(s[1].trim());
            String tenhang = s[2].trim();
            String quocgia = s[3].trim();
            hangsanxuat hsx = new hangsanxuat(tenhang,quocgia);
            double giave = Double.parseDouble(s[4].trim());
            int ngay = Integer.parseInt(s[5].trim());
            int thang = Integer.parseInt(s[6].trim());
            int nam = Integer.parseInt(s[7].trim());
            ngay n = new ngay(ngay,thang,nam);
            bophim p = new bophim(tenphim,namsanxuat,hsx,giave,n);
            a.add(p);
           }
        }else System.out.println("file không tồn tại");
        
    } catch (Exception e) {
    }
   }
   public void xuatmang(){
    for(int i=0;i<a.size();i++){
        System.out.println(a.get(i).toString());
    }
   }
   public void kiemtrgiaverekon(){
    bophim giare = a.get(0);
    for(int i=1;i<a.size();i++){
        if(a.get(i).kiemtra(giare)){
            giare = a.get(i);
        }
    }
    System.out.println("phim gia re la :"+giare.gettenphim());
     System.out.println("gia ve la :"+giare.getgiave());
   }
   public void tenhangsanxuatphim(){
    for(int i=0;i<a.size();i++){
        System.out.println("ten hang san xuat phim "+a.get(i).gettenphim()+" :"+a.get(i).gethangsanxuat().gettenhang());
    }
   }
   public void khuyenmai(double km){
    System.out.println("======gia sau khi khuyen mai======");
    
    for(int i=0;i<a.size();i++){
        
        System.out.println("gia sau khi giam phim "+a.get(i).gettenphim()+" :"+a.get(i).khuyenmai(km));
    }
   }

   public void output(){
     System.out.println("=======danh sách phim=======");
    xuatmang();
    kiemtrgiaverekon();
    System.out.println("=======ten hang san xuat phim=======");
    tenhangsanxuatphim();
    khuyenmai(10);
   
   }


    public static void main(String[] args) {
        mainbophim dd = new mainbophim();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\java_36\\bophim.txt");
        dd.output();
        
    }
}
