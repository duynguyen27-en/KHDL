package buoi11;

public class HinhHopChuNhat extends HinhChuNhat {
    private double h;

    public HinhHopChuNhat(double a, double b, double h) {
        super(a, b);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double tinhDienTich() {
        double tinh = super.tinhDienTich() + (getA()+getB())*2*h;
        return Math.round(tinh*100.0)/(100.0);
    }

    @Override
    public double tinhChuVi() {
        return Math.round((super.tinhChuVi()*2)*100.0)/(100.0);
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+h;
    }
}
