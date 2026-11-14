
package Luyen3;

public  class HangDienTu extends SanPham implements IKho{
      private int ThoiGianBH;
    
    public HangDienTu(String ma, String hoTen, NgayNhap ngayNhap, double giaGoc,int ThoiGianBH) {
        super(ma, hoTen, ngayNhap, giaGoc);
        this.ThoiGianBH=ThoiGianBH;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+ThoiGianBH;
    }

    public int getThoiGianBH() {
        return ThoiGianBH;
    }

    public void setThoiGianBH(int ThoiGianBH) {
        this.ThoiGianBH = ThoiGianBH;
    }
    public double thue(){
        return Math.round((giaGoc*0.1)*100.0)/(100.0);
    }

    @Override
    public double tinhGiaBan() {
        return (giaGoc+thue());
        
    }
    
    
    
}
