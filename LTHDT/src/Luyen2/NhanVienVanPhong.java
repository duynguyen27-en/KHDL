
package Luyen2;

public class NhanVienVanPhong extends NhanVien implements IThue{
    private int soNgayNghi;

    public NhanVienVanPhong(String ma, String hoTen, NgaySinh ngaySinh, double luongCoBan,int soNgayNghi) {
        super(ma, hoTen, ngaySinh, luongCoBan);
        this.soNgayNghi=soNgayNghi;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+soNgayNghi;
    }

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }
    
    

    @Override
    public double tinhLuong() {
        return luongCoBan-(soNgayNghi*100);
        
    }

    @Override
    public double tinhThue() {
       return tinhLuong()*0.1;
    }
    
}
