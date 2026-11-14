package buoi11;

public class HinhChuNhat extends Hinh {
    protected double a,b;

    public HinhChuNhat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double tinhDienTich() {
        return Math.round((a*b)*100.0)/(100.0);
    }

    @Override
    public double tinhChuVi() {
        return Math.round((2*(a+b))*100.0)/(100.0);
    }



    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
       
        return a+"\t"+b;
        
    }


}
