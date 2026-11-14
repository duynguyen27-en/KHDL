package buoi7;

public class khoiC extends hocsinh {
    private double dialy;
    public khoiC(String mahs, String hoten, ngaysinh ngaysinh, boolean gt, String lop, double nguvan, double toan,double dialy) {
        super(mahs, hoten, ngaysinh, gt, lop, nguvan, toan);
        this.dialy = dialy;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+dialy;
    }
    public double tinhDTB(){
        double tb = (super.getnguvan()*2 + super.gettoan() + dialy)/4;
        return Math.round(tb*100.0)/(100.0);
    }
    public double getdialy() {
        return dialy;
    }
    public void setdialy(double dialy) {
        this.dialy = dialy;
    }
    

}
