
package buoi13;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    ArrayList<DaiHocA> a = new ArrayList<>();
    public void docfile(String tenfile){
        try {
            File f = new File(tenfile);
            if(f.exists()){
                System.out.println("doc file thhanh cong");
                Scanner sc = new Scanner(f);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String s[] = line.split(",");
                    int ngay = Integer.parseInt(s[3].trim());
                      int thang = Integer.parseInt(s[4].trim());
                        int nam = Integer.parseInt(s[5].trim());
                        NgaySinh n = new NgaySinh(ngay, thang, nam);
                        double diemTB = Double.parseDouble(s[7].trim());
                   if(s[0].trim().equalsIgnoreCase("SVCQ")){
                      double diemRL = Double.parseDouble(s[8].trim()); 
                      a.add(new SVCQ(s[1].trim(),s[2].trim(),n,s[6].trim(),diemTB,diemRL));
                   }else if(s[0].trim().equalsIgnoreCase("SVLT")){
                     
                      a.add(new SVLT(s[1].trim(),s[2].trim(),n,s[6].trim(),diemTB,s[8].trim()));
                   } else if(s[0].trim().equalsIgnoreCase("SVQT")){
                      double diemIelst = Double.parseDouble(s[9].trim()); 
                      a.add(new SVQT(s[1].trim(),s[2].trim(),n,s[6].trim(),diemTB,s[8].trim(),diemIelst));
                   } 
                }
            }
        } catch (Exception e) {
        }
    }
    
    public ArrayList<DaiHocA> getA(){
        return this.a;
    }
    public void them(DaiHocA ten){
        a.add(ten);
    }
    public boolean capNhat(String ma,String ten,int ngay,int thang,int nam,String nganh,double diemtb,double diemrl,String tentruong,String quocgia,double diemielst){
        for(DaiHocA dh:a){
            if(dh.getMaSV().equalsIgnoreCase(ma)){
                dh.setTenSV(ten);
                dh.setNgaySinh(new NgaySinh(ngay,thang,nam));
                dh.setNganhHoc(nganh);
                dh.setDiemTB(diemtb);
                
                if(dh instanceof SVCQ){
                    ((SVCQ) dh).setDiemRL(diemrl);
                }else if(dh instanceof SVLT){
                    ((SVLT) dh).setTenTruongTN(tentruong);
                }else if(dh instanceof SVQT){
                    ((SVQT) dh).setQuocGia(quocgia);
                    ((SVQT) dh).setDiemIelts(diemielst);
                }
                return true;          
        }
        }
        System.out.println("khong thay ma");
        return false;
    
    }
    
    public void xoa(String ma){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getMaSV()==ma){
                a.remove(i);
            }
        }
        System.out.println("xoa k thanh cong");
    }
    
    public DaiHocA tim(String ma){
        
        for(DaiHocA dh:a){
            if(dh.getMaSV().equalsIgnoreCase(ma)){
               return dh;
            }
        }
        return null;
    }
    public ArrayList<DaiHocA> hocBong(){
        ArrayList<DaiHocA> x= new ArrayList<>();
        for(DaiHocA dh:a){
            if(dh.xetHHocBong()){
                x.add(dh);
            }
        }
        return x;
    }
    public DaiHocA timDiemTBMax(){
        DaiHocA max = a.get(0);
        double max2 = a.get(0).getDiemTB();
        for(DaiHocA dh:a){
            if(dh.getDiemTB()>max2){
                max2 = dh.getDiemTB();
                max = dh;
            }
        }
        return max;
    }
    public ArrayList<DaiHocA> getByNganh(String nganh) {
    ArrayList<DaiHocA> listNganh = new ArrayList<>();
    for (DaiHocA dh : a) {
        if (dh.getNganhHoc().trim().equalsIgnoreCase(nganh.trim())) {
            listNganh.add(dh);
        }
    }
    return listNganh;
}
    
    public void xuatmang(){
        for(DaiHocA sv:a){
            System.out.println(sv.toString());
        }
    }
    public String thongKeSoLuong() {
    int cq = 0, lt = 0, qt = 0;
    for (DaiHocA dh : a) {
        if (dh instanceof SVCQ) cq++;
        else if (dh instanceof SVLT) lt++;
        else if (dh instanceof SVQT) qt++;
    }
    return "THỐNG KÊ SINH VIÊN:\n" +
           "- Chính quy: " + cq + "\n" +
           "- Liên thông: " + lt + "\n" +
           "- Quốc tế: " + qt;
}
    
    public void output(){
        System.out.println("======= danh sach sv========");
        xuatmang();
    }
    
    
    
    public static void main(String[] args) {
        QuanLySinhVien dd = new QuanLySinhVien();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\buoi13\\danhsachsvdaihoca.txt");
        dd.output();
        
    }
    
}
