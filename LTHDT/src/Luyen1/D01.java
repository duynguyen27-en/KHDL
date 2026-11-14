
package Luyen1;

public class D01 extends TuyenSinh implements ITuyenSinh{
    private double van;
    
    public D01(String ma, String hoTen, NgaySinh ngaySinh, boolean gt, String tinhThanh, String tenTruong, double toan, double anh,double van) {
        super(ma, hoTen, ngaySinh, gt, tinhThanh, tenTruong, toan, anh);
        this.van=van;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+van;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    @Override
    public double tinhTongDiem() {
       double tong = (toan+van+anh*2)/(4);
       return Math.round(tong*100.0)/(100.0);
    }
    
    
    
}
