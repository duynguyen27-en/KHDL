package buoi7;

public class khoiD extends hocsinh {
    private double ngoaingu;
    public khoiD(String mahs, String hoten, ngaysinh ngaysinh, boolean gt, String lop, double nguvan, double toan,double ngoaingu) {
        super(mahs, hoten, ngaysinh, gt, lop, nguvan, toan);
        this.ngoaingu = ngoaingu;
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+ngoaingu;
    }
    public double tinhDTB(){
        double tb = (super.getnguvan() + super.gettoan() + ngoaingu*2)/4;
        return Math.round(tb*100.0)/(100.0);
    }
    public double getngoaingu() {
        return ngoaingu;
    }
    public void setngoaingu(double ngoaingu) {
        this.ngoaingu = ngoaingu;
    }
    

}
