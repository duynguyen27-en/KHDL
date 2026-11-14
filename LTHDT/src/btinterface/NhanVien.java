package btinterface;

public abstract class NhanVien implements ITienLuong  {
    protected String maNV,ten;
    protected double luongCoBan;

    public NhanVien( String maNV, String ten,double luongCoBan) {
        
        this.maNV = maNV;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    @Override
    public String toString() {
       
        return maNV+"\t"+ten+"\t"+luongCoBan+"\t"+( kiemTraKhenThuong()?"thuong":"k thuong");
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }


}
