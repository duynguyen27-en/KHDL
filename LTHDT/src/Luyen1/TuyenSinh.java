
package Luyen1;

public class TuyenSinh {
    protected String ma,hoTen;
    protected NgaySinh ngaySinh;
    protected boolean gt;
    protected String tinhThanh,tenTruong;
    protected double toan,anh;

    public TuyenSinh(String ma, String hoTen, NgaySinh ngaySinh, boolean gt, String tinhThanh, String tenTruong, double toan, double anh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gt = gt;
        this.tinhThanh = tinhThanh;
        this.tenTruong = tenTruong;
        this.toan = toan;
        this.anh = anh;
    }

    @Override
    public String toString() {
        return ma+"\t"+hoTen+"\t"+ngaySinh+"\t"+(gt?"Nam":"Nu")+"\t"+tinhThanh+"\t"+tenTruong+"\t"+toan+"\t"+anh;
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

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getAnh() {
        return anh;
    }

    public void setAnh(double anh) {
        this.anh = anh;
    }
    
    
    
    
    
    
}
