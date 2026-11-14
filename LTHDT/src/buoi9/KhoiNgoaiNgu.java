package buoi9;

public class KhoiNgoaiNgu extends SinhVien {
    private double tinUngDung;
    public KhoiNgoaiNgu(String ma,String ten,String nganh,boolean gt,double diemTotNghiep,double tinUngDung){
        super(ma,ten,nganh,gt,diemTotNghiep);
        this.tinUngDung=tinUngDung;
    }
    @Override
    public String toString(){
        return super.toString()+"\t"+tinUngDung;
    }
    
    @Override
    public boolean xetTotNghiep() {
        return (tinUngDung>=5.5 && getDiemThiTotNghiep()>=5.5) ;
    }

    @Override
    public double getDiemThiTotNghiep() {
        return super.getDiemTotNghiep();
    }


    public double getTinUngDung() {
        return tinUngDung;
    }
    public void setTinUngDung(double tinUngDung) {
        this.tinUngDung = tinUngDung;
    }
}
