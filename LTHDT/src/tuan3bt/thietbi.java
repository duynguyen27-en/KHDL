package tuan3bt;

public abstract class thietbi {
    protected String mathietbi,tenthietbi;
    protected long gianhap;
    protected int soluong;

    public thietbi(String mathietbi,String tenthietbi,long gianhap,int soluong){
        this.mathietbi=mathietbi;
        this.tenthietbi=tenthietbi;
        this.gianhap=gianhap;
        this.soluong=soluong;
    }
  public abstract double tinhGB();
  public double tinhkhuyenmai(){
    return 0;
  }
  public long tinhkhuyenmai(int phantamgiam){
    long km= (long)(tinhGB()*(phantamgiam/100.0));
    return km;
  }

    @Override
    public String toString(){
        return mathietbi+"\t"+tenthietbi+"\t"+gianhap+"\t"+soluong;
    }
    public String getmathietbi(){
        return mathietbi;
    }
    public void setmathietbi(String mathietbi){
        this.mathietbi=mathietbi;
    }
    public String gettenthietbi(){
        return tenthietbi;
    }
    public void settenthietbi(String tenthietbi){
        this.tenthietbi=tenthietbi;
    }
    public long getgianhap(){
        return gianhap;
    }
    public void setgianhap(long gianhap){
        this.gianhap=gianhap;
    }
    public int getsoluong(){
        return soluong;
    }
    public void setsoluong(int soluong){
        this.soluong=soluong;
    }   
   

}
