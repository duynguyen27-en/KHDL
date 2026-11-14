
package Luyen2;

public class NhanVienKinhDoanh extends NhanVien implements IThue{
    private double doanhSoBH;

    public NhanVienKinhDoanh(String ma, String hoTen, NgaySinh ngaySinh, double luongCoBan,double doanhSoBH) {
        super(ma, hoTen, ngaySinh, luongCoBan);
        this.doanhSoBH=doanhSoBH;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+doanhSoBH;
    }

    public double getDoanhSoBH() {
        return doanhSoBH;
    }

    public void setDoanhSoBH(double doanhSoBH) {
        this.doanhSoBH = doanhSoBH;
    }
    
    

    @Override
    public double tinhLuong() {
        return luongCoBan+(doanhSoBH*0.05);
    }

    @Override
    public double tinhThue() {
       return tinhLuong()*0.15;
    }
    
    
}
