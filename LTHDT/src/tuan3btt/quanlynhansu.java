package tuan3btt;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class quanlynhansu {
    ArrayList<nhanvien> a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
            File f = new File(tenfile);
            if(f.exists()){
                System.out.println("doc File thanh cong");
                  Scanner sc = new Scanner(f);
                  while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[]=line.split(",");
                    long luong = Long.parseLong(s[3].trim()); 
                    if(s[0].trim().equals("ltv")){
                        int sogiotc = Integer.parseInt(s[4].trim());
                        long luongtg = Long.parseLong(s[5].trim());
                        a.add(new laptrinhvien(s[1].trim(),s[2].trim(),luong,sogiotc,luongtg));
                    }else if(s[0].trim().equals("kdv")){
                        long doanhso = Long.parseLong(s[4].trim());
                        double tyle = Double.parseDouble(s[5].trim());
                        a.add(new kinhdoanhvien(s[1].trim(),s[2].trim(),luong,doanhso,tyle));
                    }
                  }
                
            } else System.out.println("ko tim thay file");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void xuatmang(){
            for(nhanvien nv:a){
                System.out.println(nv.toString());
            }
        }
   public void lietkenvtheobp(){
    System.out.println("========danh sach nhhan vien ltv========");
    for(nhanvien nv:a){
        if(nv instanceof laptrinhvien){
            System.out.println(nv.toString());
        }
    }
    System.out.println("========danh sach nhan vien kdv========");
    for(nhanvien nv:a){
        if(nv instanceof kinhdoanhvien){
            System.out.println(nv.toString());
        }
    }
   }
public long tongluongnv(){
    long tong=0;
    for(nhanvien nv:a){
        tong+=nv.luongthucte();
    }
    return tong;
}
public void timkinhdoanhvienxuatsac(){
    System.out.println("========danh sach kinh doanh vien xuat sac========");
    for(nhanvien nv:a){
        if(nv instanceof kinhdoanhvien){
            if(((kinhdoanhvien)nv).getdoanhsobanhang()>=100000000){
                System.out.println(nv.toString());
            }
        }
    }
}
public void tongtiencongtychitra(){
    long tong=0;
    for(nhanvien nv:a){
        if(nv.luongthucte()>15000000){
            tong+=nv.luongthucte()+nv.tinhtienthuong(0.2);
        }
        else{
            tong+=nv.luongthucte();
        }
    }
    System.out.println("tong tien cong ty chi tra la:"+tong);
}


     public void output(){
            System.out.println("=========danh sach nhan vien========= ");
            xuatmang();
            System.out.println("tong luong nhan vien la:"+tongluongnv());
            timkinhdoanhvienxuatsac();
            tongtiencongtychitra();
        }
    public static void main(String[] args){
        quanlynhansu dd=new quanlynhansu();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\tuan3btt\\nhanvien.txt");
        dd.output();
        
        
        
    }

}
