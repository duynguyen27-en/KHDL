
package Luyen4;

public class Sach {
    protected String ma,ten;
    protected NgayNhap ngayNhap;
    protected double donGia;
    protected int soLuong;

    public Sach(String ma, String ten, NgayNhap ngayNhap, double donGia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+ngayNhap+"\t"+donGia+"\t"+soLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public NgayNhap getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(NgayNhap ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
