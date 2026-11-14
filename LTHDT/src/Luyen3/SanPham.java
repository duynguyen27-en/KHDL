
package Luyen3;

public class SanPham {
    protected String ma,hoTen;
    protected NgayNhap ngayNhap;
    protected double giaGoc;

    public SanPham(String ma, String hoTen, NgayNhap ngayNhap, double giaGoc) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngayNhap = ngayNhap;
        this.giaGoc = giaGoc;
    }

    @Override
    public String toString() {
        return ma+"\t"+hoTen+"\t"+ngayNhap+"\t"+giaGoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public NgayNhap getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(NgayNhap ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }
    
    
    
}
