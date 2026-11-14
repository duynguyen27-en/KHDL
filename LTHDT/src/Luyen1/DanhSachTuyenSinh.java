
package Luyen1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachTuyenSinh {
    ArrayList<ITuyenSinh> a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
            File f = new File(tenfile);
            if(f.exists()){
                System.out.println("doc file than cong");
                Scanner sc = new Scanner(f);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[]= line.split(",");
                    int ngay = Integer.parseInt(s[3].trim());
                    int thang = Integer.parseInt(s[4].trim());
                    int nam = Integer.parseInt(s[5].trim());
                    NgaySinh n = new NgaySinh(ngay, thang, nam);
                    boolean gt = Boolean.parseBoolean(s[6].trim());
                    double toan = Double.parseDouble(s[9].trim());
                     double anh = Double.parseDouble(s[10].trim());
                     if(s[0].trim().equalsIgnoreCase("A")){
                          double ly = Double.parseDouble(s[11].trim());
                          a.add(new A01(s[1].trim(),s[2].trim(),n,gt,s[7].trim(),s[8].trim(),toan,anh,ly));
                     }else if(s[0].trim().equalsIgnoreCase("D")){
                          double van = Double.parseDouble(s[11].trim());
                          a.add(new D01(s[1].trim(),s[2].trim(),n,gt,s[7].trim(),s[8].trim(),toan,anh,van));
                     }
                }
            }
            
        } catch (Exception e) {
        }
    }
    public void xuatmang(){
        for(ITuyenSinh ts:a){
            System.out.println(ts.toString());
        }
    }
    public ArrayList<ITuyenSinh> getA(){
        return this.a;
    }
    public void them(ITuyenSinh x){
        a.add(x);
    }
    public ITuyenSinh thhuKhoa(){
      
       ITuyenSinh max =a.get(0);
       double max2 = a.get(0).tinhTongDiem();
       for(ITuyenSinh ts:a){
           if(ts.tinhTongDiem()>max2){
               max2 = ts.tinhTongDiem();
               max=ts;
           }
       }
       return max;
    }
    
    
    public void xapxep() {
    Collections.sort(a, new Comparator<ITuyenSinh>() {
        @Override
        public int compare(ITuyenSinh o1, ITuyenSinh o2) {
           
            return Double.compare(o2.tinhTongDiem(), o1.tinhTongDiem());
        }
    });
}
    
    
    public void output(){
        xuatmang();
    }
    
    
    
    public static void main(String[] args) {
        DanhSachTuyenSinh dd = new DanhSachTuyenSinh();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\Luyen1\\danhsachtuyensinh.txt");
        dd.output();
        
    }
    
}
