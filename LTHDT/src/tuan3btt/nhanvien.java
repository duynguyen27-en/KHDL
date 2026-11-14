package tuan3btt;

public abstract class nhanvien {
    protected String manv,hoten;
    protected long luong;
    public nhanvien(String manv,String hoten,long luong){
        this.manv=manv;
        this.hoten=hoten;
        this.luong=luong;
    }
    public abstract long luongthucte();
    public double tinhtienthuong(){
        return 0;
    }
    public long tinhtienthuong(double hs){
          long tienthuong=(long)(luong*hs);
          return tienthuong;
    }
    @Override
    public String toString(){
        return manv+"\t"+hoten+"\t"+luong;
    }
    public String getmanv(){
        return manv;
    }
    public void setmanv(String manv){
        this.manv=manv;
    }
    public String gethoten(){
        return hoten;
    }
    public void sethoten(String hoten){
        this.hoten=hoten;
    }
    public long getluong(){
        return luong;
    }
    public void setluong(long luong){
        this.luong=luong;
    }
   

}
