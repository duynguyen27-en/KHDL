package buoi5;
public abstract class sinhvien {
    protected String masv,hoten;
    protected boolean gt;
    public sinhvien(String masv,String hoten,boolean gt){
        this.masv= masv;
        this.hoten = hoten;
        this.gt=gt;
    }
   
    public abstract double tinhDTB();
    
    public abstract String xeploai();
    @Override
    public String toString(){
        return masv+"\t"+hoten+"\t"+(gt?"nam":"nu");

    }
    public String getmasv(){
        return masv;
    }
    public void setmasv(String masv){
        this.masv=masv;
    }
    public String gethoten(){
        return hoten;
    }
    public void sethoten(String hoten){
        this.hoten=hoten;
    }
    public boolean isgt(){
        return gt;
    }
    public void setgt(boolean gt){
        this.gt=gt;
    }    
}
