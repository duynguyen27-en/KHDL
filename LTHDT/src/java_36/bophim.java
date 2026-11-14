package java_36;

public class bophim {
    private String tenphim;
    private int namsanxuat;
    private hangsanxuat hangsanxuat;
    private double giave;
    private ngay ngay;
    public bophim(String tenphim,int namsanxuat,hangsanxuat hangsanxuat,double giave,ngay ngay)
    {
        this.tenphim=tenphim;
        this.namsanxuat=namsanxuat;
        this.hangsanxuat=hangsanxuat;
        this.giave=giave;
        this.ngay=ngay;
    }

    @Override
    public String toString() {
        return tenphim+"\t"+namsanxuat+"\t"+hangsanxuat.toString()+"\t"+giave+"\t"+ngay.toString();
    }
   public boolean kiemtra(bophim bophim){
    return this.giave<bophim.giave;
   }
  public double khuyenmai(double km){
    double gia = this.giave*(1-km/100);
    return Math.round(gia*100.0)/(100.0);
  }

    public String gettenphim(){
        return this.tenphim;
    }
    public int getnamsanxuat(){
        return this.namsanxuat;
    }
    public hangsanxuat gethangsanxuat(){
        return this.hangsanxuat;
    }
    public double getgiave(){
        return this.giave;
    }
    public ngay getngay(){
        return this.ngay;
    }
    public void settenphim(String tenphim){
        this.tenphim=tenphim;
    }
    public void setnamsanxuat(int namsanxuat){
        this.namsanxuat=namsanxuat;
    }
    public void sethangsanxuat(hangsanxuat hangsanxuat){
        this.hangsanxuat=hangsanxuat;
    }
    public void setgiave(double giave){
        this.giave=giave;
    }
    public void setngay(ngay ngay){
        this.ngay=ngay;
    }
   
    
    

}
