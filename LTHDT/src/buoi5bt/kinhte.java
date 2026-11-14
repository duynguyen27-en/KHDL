package buoi5bt;

public class kinhte extends sinhvien {
    private double nlkt,makt;
    public kinhte(String masv,String hoten,boolean gt,double nlkt,double makt)
    {
        super(masv,hoten,gt);
        this.nlkt=nlkt;
        this.makt=makt;
    }
    public String toString()
    {
        return super.toString()+"\t"+nlkt+"\t"+makt+"\t";
    }
    public double tinhDTB(){
        double tb=(nlkt+makt)/2;
        return Math.round(tb*100.0)/(100.0);
    }
    public double monhesohai(){
        return this.makt;
    }

    public double getnlkt(){
        return nlkt;
    }
    public double getmakt(){
        return makt;
    }
    public void setnlkt(double nlkt){
        this.nlkt=nlkt;
    }
    public void setmakt(double makt){
        this.makt=makt;
    }
    

}
