package buoi9;

public class KhoiKhoaHocMayTinh extends SinhVien {
    private double toeic;
    public KhoiKhoaHocMayTinh(String ma,String ten,String nganh,boolean gt,double diemTotNghiep,double toeic){
        super(ma,ten,nganh,gt,diemTotNghiep);
        this.toeic=toeic;
    }
    @Override
    public String toString(){
        return super.toString()+"\t"+toeic;
    }

    @Override
    public boolean xetTotNghiep() {
        return (toeic>=450 && getDiemThiTotNghiep()>=5) ;
    }

    @Override
    public double getDiemThiTotNghiep() {
        return super.getDiemTotNghiep();
    }

    public double getToeic() {
        return toeic;
    }

    public void setToeic(double toeic) {
        this.toeic = toeic;
    }

}
