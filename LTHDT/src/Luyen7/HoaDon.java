
package Luyen7;

public abstract class HoaDon {
    protected String maHD,tenKhach;
    protected NgayHD ngayHD;
    protected double donGia;

    public HoaDon(String maHD, String tenKhach, NgayHD ngayHD, double donGia) {
        this.maHD = maHD;
        this.tenKhach = tenKhach;
        this.ngayHD = ngayHD;
        this.donGia = donGia;
    }
    public abstract double tinhThanhTien();
    

    @Override
    public String toString() {
        return maHD+"\t"+tenKhach+"\t"+ngayHD+"\t"+donGia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public NgayHD getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(NgayHD ngayHD) {
        this.ngayHD = ngayHD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    
    
}
