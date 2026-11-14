package buoi5;

public class kinhte extends sinhvien {
    private double nlkt,makt;
    public kinhte(String masv,String hoten,boolean gt,double nlkt,double makt){
        super(masv,hoten,gt);
        this.nlkt=nlkt;
        this.makt=makt;
    }
    @Override
    public String toString(){
        return super.toString()+"\t"+nlkt+"\t"+makt;
    }
    @Override
    public double tinhDTB(){
        double tb = (nlkt*2+makt)/3;
        return Math.round(tb*100.0)/(100.0);
    }
    @Override
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
        return super.masv;
    }
    public void setmasv(String masv){
        super.masv=masv;
    }
    public String gethoten(){
        return super.hoten;
    }
    public void sethoten(String hoten){
        super.hoten=hoten;
    }
    public boolean getgt(){
        return super.gt;
    }
    public void setgt(boolean gt){
        super.gt=gt;
    }  
    public double getnlkt(){
        return nlkt;
    }
    public void setnlkt(double nlkt){
        this.nlkt=nlkt;
    }
    public double getmakt(){
        return makt;
    }
    public void setmakt(double makt){
        this.makt=makt;
    }    
    

}
