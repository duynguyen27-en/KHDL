package buoi12;

public abstract class SanPham {
    protected String maSp;
    protected double donGia,soLuong;

    public SanPham(String maSp, double donGia, double soLuong) {
        this.maSp = maSp;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    
   
    public abstract double tinhChietKhau();

    public String toString() {
        return maSp+"\t"+donGia+"\t"+soLuong;
    }

}

