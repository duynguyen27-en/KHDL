
package buoi5bt;
public abstract class sinhvien {
    protected String masv,hoten;
    protected boolean gt;

    public sinhvien(String masv,String hoten,boolean gt)
    {
        this.masv=masv;
        this.hoten=hoten;
        this.gt=gt;
    }
    public abstract double tinhDTB();
    public abstract double monhesohai();

    @Override
    public String toString() {
        return masv+"\t"+hoten+"\t"+(gt?"Nam":"Nu")+"\t";
    }
   public String xeploai(){
        double tb = tinhDTB();
        if(tb<3.5)
            return "kem";
        if(tb<5)
            return "yeu";
        if(tb<6.5)
            return "trung binh";
        if(tb<8)
            return "kha";
        if(tb<9.5)
            return "gioi";
        return "xuat sac";
    }
    
    public String getmasv(){
        return masv;
    }
    public String gethoten(){
        return hoten;
    }
    public boolean getgt(){
        return gt;
    }
    public void setmasv(String masv){
        this.masv=masv;
    }
    public void sethoten(String hoten){
        this.hoten=hoten;
    }
    public void setGt(boolean gt){
        this.gt=gt;
    }
    

}
