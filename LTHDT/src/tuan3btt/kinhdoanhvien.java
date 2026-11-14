package tuan3btt;

public class kinhdoanhvien extends nhanvien {
    private long doanhsobanhang;
    private double tylehoahong;
    public kinhdoanhvien(String manv,String hoten,long luong,long doanhsobanhang,double tylehoahong){
        super(manv,hoten,luong);
        this.doanhsobanhang=doanhsobanhang;
        this.tylehoahong=tylehoahong;
    }   
    @Override
    public String toString(){
        return super.toString()+"\t"+doanhsobanhang+"\t"+tylehoahong;
    }
    public long luongthucte(){
        long ltt=getluong()+(long)(doanhsobanhang*tylehoahong);
        return ltt;    
    }
    public long getdoanhsobanhang(){
        return doanhsobanhang;
    }
    public void setdoanhsobanhang(long doanhsobanhang){
        this.doanhsobanhang=doanhsobanhang;
    }
    public double getTylehoahong(){
        return tylehoahong;
    }
    public void setTylehoahong(double tylehoahong){
        this.tylehoahong=tylehoahong;
    }   

}
