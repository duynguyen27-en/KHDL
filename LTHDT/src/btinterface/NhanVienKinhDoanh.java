package btinterface;

public class NhanVienKinhDoanh extends NhanVien {
    private double doanhSoBanHang;

    public NhanVienKinhDoanh( String maNV, String ten,double luongCoBan, double doanhSoBanHang) {
        super( maNV, ten, luongCoBan);
        this.doanhSoBanHang = doanhSoBanHang;
    }

    @Override
    public String toString() {
       
        return super.toString()+"\t"+doanhSoBanHang;
    }
    public double tinhLuongThucNhan(){
        double luong = luongCoBan +(doanhSoBanHang*0.1);
        return Math.round(luong*100.0)/(100.0);
    }
    public boolean kiemTraKhenThuong(){
        return (doanhSoBanHang>=50000000);
    }

    public double getDoanhSoBanHang() {
        return doanhSoBanHang;
    }

    public void setDoanhSoBanHang(double doanhSoBanHang) {
        this.doanhSoBanHang = doanhSoBanHang;
    }
    
    


}
