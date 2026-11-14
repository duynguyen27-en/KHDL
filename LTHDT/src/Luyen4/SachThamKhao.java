
package Luyen4;

public class SachThamKhao extends Sach implements ISach{
    private double thue;
    
    public SachThamKhao(String ma, String ten, NgayNhap ngayNhap, double donGia, int soLuong,double thue) {
        super(ma, ten, ngayNhap, donGia, soLuong);
        this.thue=thue;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public double tinhThanhTien() {
       double tong = (donGia*soLuong) +thue;
       return Math.round(tong*100.0)/(100.0);
    }
    
    
    
}
