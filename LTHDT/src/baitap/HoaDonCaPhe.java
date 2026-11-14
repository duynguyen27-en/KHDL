package baitap;
public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien1kg;
    private double khoiLuong;
    public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1kg, double khoiLuong) {
    this.tenLoaiCaPhe =tenLoaiCaPhe;
    this.giaTien1kg=giaTien1kg;
    this.khoiLuong=khoiLuong;
    }
    public double tinhTongTien(){
        return giaTien1kg*khoiLuong;
    }
    public boolean kiemTraKhoiLuongLH(double x){
        return khoiLuong>x;
    }
    public boolean kiemTraTongTienLH500k(){
        return tinhTongTien()>500; 
    }
     public double giamGia(double k){
        return (kiemTraTongTienLH500k())?(double)(k/100)*tinhTongTien():0;
     }
     public double giaSauKhiGiam(double n){
        return (tinhTongTien()-giamGia(n));

     }
}
