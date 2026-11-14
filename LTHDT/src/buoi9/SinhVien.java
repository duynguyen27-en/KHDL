package buoi9;

public abstract  class SinhVien implements ITotNghiep {
    protected String ma,ten,nganh;
    protected boolean gt;
    protected double diemTotNghiep;
     public SinhVien(String ma,String ten,String nganh,boolean gt,double diemTotNghiep){
        this.diemTotNghiep=diemTotNghiep;
        this.gt=gt;
        this.nganh=nganh;
        this.ten=ten;
        this.ma=ma;
     }
    @Override
    public String toString(){
        return ma+"\t"+ten+"\t"+nganh+"\t"+(gt?"nam":"nu")+"\t"+diemTotNghiep+"\t"+(xetTotNghiep()?"dau":"rot");
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public double getDiemTotNghiep() {
        return diemTotNghiep;
    }

    public void setDiemTotNghiep(double diemTotNghiep) {
        this.diemTotNghiep = diemTotNghiep;
    }
     
    


     }


