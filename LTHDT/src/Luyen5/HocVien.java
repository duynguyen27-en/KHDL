
package Luyen5;

public class HocVien {
    protected String maHV,tenHV,soCM;
    protected NgayNhap ngayNhap;
    protected double donGia;

    public HocVien(String maHV, String tenHV, String soCM, NgayNhap ngayNhap, double donGia) {
        this.maHV = maHV;
        this.tenHV = tenHV;
        this.soCM = soCM;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return maHV+"\t"+tenHV+"\t"+soCM+"\t"+ngayNhap+"\t"+donGia;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public String getSoCM() {
        return soCM;
    }

    public void setSoCM(String soCM) {
        this.soCM = soCM;
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
    
    
}
