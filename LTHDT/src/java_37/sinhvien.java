package java_37;


public class sinhvien {
    private String masv;
    private String hoten;
    private ngaysinh n;
    private double dtb;
    private lop lop;

    public sinhvien(String masv,String hoten,ngaysinh ngay,double dtb,lop lop){
        this.masv = masv;
        this.hoten = hoten;
        this.n = ngay;
        this.dtb = dtb;
        this.lop = lop;
    }
    @Override
    public String toString() {
        return masv+"\t"+hoten+"\t"+n.toString()+"\t"+dtb+"\t"+lop.toString();
    }
    public boolean ngaysinhtrungk(sinhvien ngaykhac){
        return this.n.equals(ngaykhac.getn());
    }

    public String getmasv(){
        return masv;
    }
    public void setmasv(String masv){
        this.masv = masv;
    }
    public String gethoten(){
        return hoten;
    }
    public void sethoten(String hoten){
        this.hoten = hoten;
    }
    public ngaysinh getn(){
        return n;
    }
    public void setn(ngaysinh n){
        this.n = n;
    }
    public double getdtb(){
        return dtb;
    }
    public void setdtb(double dtb){
        this.dtb = dtb;
    }
    public lop getlop(){
        return lop;
    }
    public void setlop(lop lop){
        this.lop = lop;
    }
    

}
