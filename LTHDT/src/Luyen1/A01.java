
package Luyen1;

public class A01 extends TuyenSinh implements ITuyenSinh{
    private double ly;
    
    public A01(String ma, String hoTen, NgaySinh ngaySinh, boolean gt, String tinhThanh, String tenTruong, double toan, double anh,double ly) {
        super(ma, hoTen, ngaySinh, gt, tinhThanh, tenTruong, toan, anh);
        this.ly=ly;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+ly;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    @Override
    public double tinhTongDiem() {
        double tong=(toan*2+ly+anh)/(4);
        return Math.round(tong*100.0)/(100.0);
    }
    
    
    
}
