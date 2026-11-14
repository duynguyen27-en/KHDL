
package Luyen2;


public abstract class NhanVien {
    protected String ma,hoTen;
    protected NgaySinh ngaySinh;
    protected double luongCoBan;

    public NhanVien(String ma, String hoTen, NgaySinh ngaySinh, double luongCoBan) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.luongCoBan = luongCoBan;
    }
    public abstract double tinhLuong();

    @Override
    public String toString() {
        return ma+"\t"+hoTen+"\t"+ngaySinh+"\t"+luongCoBan;
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

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    
    
}
